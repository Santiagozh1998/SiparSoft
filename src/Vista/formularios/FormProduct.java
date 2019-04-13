/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author santiago
 */
public class FormProduct extends javax.swing.JFrame {

    
    private String Informacion = "";
    
    public FormProduct() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        CodigoTitle = new javax.swing.JLabel();
        NombreTitle = new javax.swing.JLabel();
        TipoTitle = new javax.swing.JLabel();
        ColorTitle = new javax.swing.JLabel();
        Tipo = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        ProveedorTitle = new javax.swing.JLabel();
        Proveedor = new javax.swing.JTextField();
        EnviarUser = new javax.swing.JLabel();
        TelefonoTitle = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();
        CantidadTitle = new javax.swing.JLabel();
        PrecioTitle = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(0, 87, 146));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleText.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        TitleText.setForeground(new java.awt.Color(255, 255, 255));
        TitleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleText.setText("Ingreso de nuevo producto");
        Title.add(TitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 350, -1));

        Container.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));
        Container.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, 30));
        Container.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 30));

        CodigoTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        CodigoTitle.setText("Código:");
        Container.add(CodigoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, -1));

        NombreTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        NombreTitle.setText("Nombre:");
        Container.add(NombreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        TipoTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        TipoTitle.setText("Tipo:");
        Container.add(TipoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        ColorTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        ColorTitle.setText("Color: ");
        Container.add(ColorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, -1));
        Container.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 30));
        Container.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 30));

        ProveedorTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        ProveedorTitle.setText("Proveedor");
        Container.add(ProveedorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, -1));
        Container.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 30));

        EnviarUser.setBackground(new java.awt.Color(0, 87, 146));
        EnviarUser.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        EnviarUser.setForeground(new java.awt.Color(255, 255, 255));
        EnviarUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnviarUser.setText("Enviar");
        EnviarUser.setOpaque(true);
        EnviarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarUserMouseClicked(evt);
            }
        });
        Container.add(EnviarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 200, 40));

        TelefonoTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        TelefonoTitle.setText("Telefono:");
        Container.add(TelefonoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, -1));
        Container.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, 30));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/shirt1.png"))); // NOI18N
        Container.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 100));

        CantidadTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        CantidadTitle.setText("Cantidad:");
        Container.add(CantidadTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, -1));

        PrecioTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        PrecioTitle.setText("Precio");
        Container.add(PrecioTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, -1));
        Container.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 160, 30));
        Container.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 160, 30));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarUserMouseClicked

        int flag = 0;
        
        if(Nombre.getText().equals("") ||
                Codigo.getText().equals("") ||
                Tipo.getText().equals("") ||
                Color.getText().equals("") ||
                Proveedor.getText().equals("") || 
                Telefono.getText().equals("") ||
                Cantidad.getText().equals("") ||
                Precio.getText().equals("")){
            
            flag = 1;
        }
        
        if(flag == 0){
            
            Informacion = 
                    Nombre.getText() + "," + 
                    Codigo.getText() + "," +
                    Tipo.getText() + "," +
                    Color.getText() + "," +
                    Proveedor.getText() + "," +
                    Telefono.getText() + "," +
                    Cantidad.getText() + "," +
                    Precio.getText();
                    this.dispose();
                    
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Ingrese datos permitidos", "Datos erroneos", JOptionPane.WARNING_MESSAGE);                
        }
        
    }//GEN-LAST:event_EnviarUserMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        Informacion = "Cerrada";
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    public String getInformacion() {
        
        return Informacion;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel CantidadTitle;
    private javax.swing.JTextField Codigo;
    private javax.swing.JLabel CodigoTitle;
    private javax.swing.JTextField Color;
    private javax.swing.JLabel ColorTitle;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel EnviarUser;
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel PrecioTitle;
    private javax.swing.JTextField Proveedor;
    private javax.swing.JLabel ProveedorTitle;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel TelefonoTitle;
    private javax.swing.JTextField Tipo;
    private javax.swing.JLabel TipoTitle;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleText;
    // End of variables declaration//GEN-END:variables
}