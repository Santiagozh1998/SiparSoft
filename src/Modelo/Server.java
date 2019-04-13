
package Modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Server extends javax.swing.JFrame {

     //CONEXION A BASE DE DATOS
   private String url= "jdbc:postgresql://localhost:5432/inventario";
   private String user=""; 
   private String password=""; 
   public Statement pq; 
   public ResultSet resultado;
  
   //CREACION HILO
   private ServerSocket servidorSocket; 
   private Socket cliente; 
   private int puerto=4545;
   private int maximosConectados= 4;  
    
   
   public Server() {
        initComponents();
        //SI DEO ESTO ASI, FUNCIONA MELO
        user="postgres";
        password="1";
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true); 
        
       //SI DEJO ESTOA AQUI FUNCIONA MELO
        creacionServidor();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LabelContrasenia = new java.awt.Label();
        CajonContrasenia = new javax.swing.JPasswordField();
        CajonUsuario = new javax.swing.JTextField();
        Escritorio = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        LabelUsuario1 = new java.awt.Label();
        BotonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVIDOR");
        setName("ventana"); // NOI18N

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 255));
        PanelPrincipal.setForeground(new java.awt.Color(0, 0, 255));
        PanelPrincipal.setToolTipText("");

        LabelContrasenia.setAlignment(java.awt.Label.CENTER);
        LabelContrasenia.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LabelContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        LabelContrasenia.setText("PASSWORD BD");

        Escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Escritorio.setEditable(false);
        Escritorio.setForeground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setBackground(new java.awt.Color(51, 51, 255));
        Titulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("SERVIDOR SIPARSOFT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        LabelUsuario1.setAlignment(java.awt.Label.CENTER);
        LabelUsuario1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LabelUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario1.setText("USUARIO BD");

        BotonInicio.setText("INICIAR SERVIDOR");
        BotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(LabelContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CajonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CajonContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonInicio))))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CajonContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        LabelContrasenia.getAccessibleContext().setAccessibleName("PASSWORD BD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("SERVIDOR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseClicked
        // TODO add your handling code here:
      
      //AL DAR CLICK SOBRE EL BOTON FALLA Y DEJA CONGELA TODO      
        if(CajonUsuario.getText().equals("") || CajonContrasenia.getPassword().equals("")){
            JOptionPane.showMessageDialog(this, "DIGITE LOS CAMPOS SOLICITADOS PARA REALIZAR CONEXION A BASE DE DATOS");
        }else{
            user=CajonUsuario.getText(); 
            password=String.valueOf(CajonContrasenia.getPassword()); 
            CajonContrasenia.setText("");
            //descomentar para ver su funcionamiento
            //creacionServidor();
        }
    }//GEN-LAST:event_BotonInicioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JPasswordField CajonContrasenia;
    private javax.swing.JTextField CajonUsuario;
    private java.awt.TextArea Escritorio;
    private java.awt.Label LabelContrasenia;
    private java.awt.Label LabelUsuario1;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void creacionServidor(){  
       
       try { 
           
           servidorSocket = new ServerSocket(puerto,maximosConectados);
           mostrarMensaje("\t\tSERVIDOR INICIALIZADO");
           mostrarMensaje("  IP SERVIDOR PARA CONEXION REMOTA: "+InetAddress.getLocalHost().getHostAddress());
           mostrarMensaje("\t\tESPERANDO CLIENTES");
           
          while(true){
               cliente=servidorSocket.accept(); //aceptar llamado cliente
               HiloCliente hilo= new HiloCliente(cliente); //Creacion hilo cliente
               hilo.start(); //inicializacion 
               mostrarMensaje("[Cliente conectado]:"+cliente.getInetAddress().getHostAddress()); 
           }
           
       } catch (IOException ex) {
           mostrarMensaje("\tFALLO CONEXION USUARIOS"); 
           
       }
   }


public void mostrarMensaje(String mensaje){
    Escritorio.append(mensaje+"\n"); 
}


private class HiloCliente extends Thread { //CLASE INTERNA DONDE SE CREAN LOS HILOS
       private Socket hilocliente; 
       private DataInputStream input;
       private DataOutputStream output;
       private Connection conexion;
       
        
       public HiloCliente(Socket clie){ //CONTRUCCTOR SOCKET
          this.hilocliente=clie; 
         
         try { 
               input= new DataInputStream(clie.getInputStream());
               output= new DataOutputStream(clie.getOutputStream());
               
               conexBD();
            
           } catch (IOException ex) {
               mostrarMensaje("\t FALLO EN LA ACTIVIACION DE FLUJOS CON EL CLIENTE");
               finalizar();
           } 
  
       }
               
        @Override
        public void run() { //EJECUTA EL HILO, Y LOS METODOS A REALIZAR
           try {
                while (true){  
                    
                     String url= input.readUTF();  
                     int val= url.indexOf(" "); 
                     String cadena= url.substring(0, val); 
                     
                     if(cadena.equals("SELECT")){ //ESTO ES PARA VERIFICAR QUE TIPO DE OPERACION SE VA A EJECUTAR CON LA BASE DE DATOS 
                         int veri =0; 
                         resultado=pq.executeQuery(url); //EJECUCION DEL CODIGO SQL
                          
                         while(resultado.next()){
                             veri=1;  //VERIFICA SI HAY ALMENOS UNA ENTRADA AL WHILE
                             
                             String mensajeEn=new String(); //AQUI SE ALMACENARÁN LOS RESULTADOS
                             int col=1; 
                             
                             while(col<=resultado.getMetaData().getColumnCount()){ //ME PERMITE CONOCER LA CANTIDAD DE COLUMNAS
                                mensajeEn+=resultado.getString(col)+","; //CONCATENA LOS RESULTADOS OBTENIDOS EN UN STRING
                                col++;
                             }
                             
                             output.writeUTF(mensajeEn); //Envio de datos al cliente
                        }
                         
                         if(veri==0){
                            output.writeUTF(","); //SI NO ENTRO AL WHILE, SIGNIFICA QUE NO TIENE VALORES QUE RETORNAR   
                         }
                          
                         mostrarMensaje("[Cliente]:"+cliente.getInetAddress().getHostAddress() +" realizo operacion de:"+cadena);
                       
                     }else if(cadena.equals("INSERT")||cadena.equals("UPDATE")|| cadena.equals("DELETE")){
                        
                       int z=pq.executeUpdate(url); //ESTE ME DEVUELVE UN DIGITO
                       mostrarMensaje("[Cliente]:"+cliente.getInetAddress().getHostAddress() +" realizo operacion de:" +cadena);
                    }
                    
                }
            } catch (IOException ex) { 
                   
                   finalizar();
            } catch (SQLException ex) {
                   finalizar();
            }    
     }
             
     public void conexBD(){ //conexion a base de datos 
        try {
           
             Class.forName("org.postgresql.Driver");
             conexion=DriverManager.getConnection(url, user, password);
             pq= conexion.createStatement(); 
             
             mostrarMensaje("\n\tCONEXION CON BASE DE DATOS ACTVA");   
             
             
            } catch (ClassNotFoundException ex) {
                mostrarMensaje("\tFALLO CONEXION BASE DE DATOS INGRESE USUARIO Y CONTRASEÑA DE  NUEVO");
            } catch (SQLException ex) {
                mostrarMensaje("\t FALLO CONEXION BASE DE DATOS INGRESE USUARIO Y CONTRASEÑA DE  NUEVO"); 
            }
         
   }    
        
        public void finalizar(){ //CIERRA LAS CONECIONES CON EL CLIENTE 
            try { 
                   conexion.close();
                   hilocliente.close();
                   input.close();
                   output.close();
                   mostrarMensaje("[Cliente caido]:"+cliente.getInetAddress().getHostAddress());
                   
                } catch (IOException ex1) {
                   mostrarMensaje("\t FALLO CIERRE DE FLUJOS"); 
                } catch (SQLException ex) {
                   mostrarMensaje("\t FALLO CIERRE DE FLUJOS"); 
                }
        }
    }  


}
