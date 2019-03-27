package Modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    //CONEXION A BASE DE DATOS
   private String url= "jdbc:postgresql://localhost:5432/inventario";
   private String user="postgres"; 
   private String password= "1"; 
   public Statement pq; 
   public ResultSet resultado;
  
   //CREACION HILO
   private ServerSocket servidorSocket; 
   private Socket cliente; 
   private int puerto=4545;
   private int maximosConectados= 4; 
  
   public void initServer(){ 
       creacionServidor();
   }
   
   public void conexBD(){ //conexion a base de datos 
    try {
           Class.forName("org.postgresql.Driver");
           Connection conexion= DriverManager.getConnection(url, user, password);
           pq= conexion.createStatement(); 
           System.out.println("-------CONEXION CON BASE DE DATOS ACTVA-------");       
           
    } catch (ClassNotFoundException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
    }  catch (SQLException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
       }
         
   }
 
   private void creacionServidor(){
       
       try { 
           servidorSocket = new ServerSocket(puerto,maximosConectados);
           System.out.println("---------SERVIDOR INICIALIZADO----------"); //mensaje de confirmacion
           System.out.println("---------ESPERANDO CLIENTES----------"); //mensaje de confirmacion
            
          while(true){
               cliente=servidorSocket.accept(); //aceptar llamado cliente
               HiloCliente hilo= new HiloCliente(cliente); //Creacion hilo cliente
               hilo.start(); //inicializacion 
               System.out.println("[Cliente conectado]:"+cliente.getInetAddress().getHostAddress()); 
           }
           
       } catch (IOException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   
 private class HiloCliente extends Thread { //CLASE INTERNA DONDE SE CREAN LOS HILOS
       private Socket hilocliente; 
       private DataInputStream input;
       private DataOutputStream output;
        
       public HiloCliente(Socket clie){ //CONTRUCCTOR SOCKET
          this.hilocliente=clie; 
         
          try { 
               input= new DataInputStream(clie.getInputStream());
               output= new DataOutputStream(clie.getOutputStream()); 
           } catch (IOException ex) {
               Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);   
           }          
          conexBD();
       }
               
               
        @Override
        public void run() { //EJECUTA EL HILO, Y LOS METODOS A REALIZAR
           try {
               
                while (true){  
                     String url= input.readUTF();   //LEE LOS DATOS QUE EL CLIENTE ENVIA
                     int val= url.indexOf(" "); //BUSCA LA PRIMERA COINCIDENCIA Y ME RETORNA SU POSICION
                     String cadena= url.substring(0, val); // OBTENGO LA SUBCADENA, DESDE EL INICIO HASTA ANTES DEL ESPACIO   
                     
                    if(cadena.equals("SELECT")){ //ESTO ES PARA VERIFICAR QUE TIPO DE OPERACION SE VA A EJECUTAR CON LA BASE DE DATOS 
                      
                         resultado=pq.executeQuery(url); //EJECUCION DEL CODIGO SQL
                     
                         while(resultado.next()){
                          int col=1; 
                          String mensajeEn=new String(); //AQUI SE ALMACENARÁN LOS RESULTADOS
                          
                          while(col<=resultado.getMetaData().getColumnCount()){ //ME PERMITE CONOCER LA LONGITUD DE LAS TABLAS
                              mensajeEn+=resultado.getString(col)+" "; //CONCATENA LOS RESULTADOS OBTENIDOS EN UN STRING
                              col++;
                          }
                          
                         output.writeUTF(mensajeEn); //Envio de datos al cliente
                         }
                         
                       System.out.println("[Cliente]:"+cliente.getInetAddress().getHostAddress() +" realizo operacion de:" +cadena);
                       
                    } else if(cadena.equals("INSERT")||cadena.equals("UPDATE")|| cadena.equals("DELETE")){
                        
                       int z=pq.executeUpdate(url); //ESTE ME DEVUELVE UN DIGITO
                       System.out.println("[Cliente]:"+cliente.getInetAddress().getHostAddress() +" realizo operacion de:" +cadena);
                    }
                }
            } catch (IOException ex) { 
                   finalizar();
            } catch (SQLException ex) {
                   finalizar();
            }    
       }
             
             
        public void finalizar(){ //CIERRA LAS CONECIONES CON EL CLIENTE 
            try { 
                   input.close();
                   output.close();
                   hilocliente.close();
                   System.out.println("[Cliente caido]:"+cliente.getInetAddress().getHostAddress());
               } catch (IOException ex1) {
                   Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex1);
               }
         }
     }  
   
}

