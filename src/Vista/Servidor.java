package Vista;

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
   public java.sql.Statement pq; 
   public ResultSet resultado;
  
   //CREACION HILO
   private ServerSocket servidorSocket; 
   private Socket cliente; 
   private int puerto=4545;
   private int maximosConectados= 4; 
  
   public void initServer(){
       conexBD(); 
       creacionServidor();
   }
   
   private void conexBD(){ //conexion a base de datos 
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
               System.out.println("Cliente conectado:"+cliente.getInetAddress().getHostName()); //mensaje de confirmacion
               
           }
       } catch (IOException ex) {
           Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   
 private class HiloCliente extends Thread { 
       private Socket hilocliente; 
       private DataInputStream input;
       private DataOutputStream output;
       
       public HiloCliente(Socket clie){
          this.hilocliente=clie; 
          
          try { 
               input= new DataInputStream(hilocliente.getInputStream());
               output= new DataOutputStream(hilocliente.getOutputStream()); 
           } catch (IOException ex) {
               Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);   
           }          
       }
               
               
        @Override
        public void run() {
            
        }
     
 }  
   
}

