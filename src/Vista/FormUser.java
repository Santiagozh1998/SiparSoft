package Vista;

public class FormUser extends javax.swing.JFrame {
       
    private String Informacion = "";
    
    public FormUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Container = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ApellidoTitle = new javax.swing.JLabel();
        NombreTitle = new javax.swing.JLabel();
        TipoTitle = new javax.swing.JLabel();
        NroTitle = new javax.swing.JLabel();
        Tipoid = new javax.swing.JTextField();
        Nroid = new javax.swing.JTextField();
        CelularTitle = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        EnviarUser = new javax.swing.JLabel();
        PassTitle = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setText("Apellido:");

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
        TitleText.setText("Formulario para nuevo empleado");
        Title.add(TitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 350, -1));

        Container.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));
        Container.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));
        Container.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Usuario.png"))); // NOI18N
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));

        ApellidoTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        ApellidoTitle.setText("Apellido:");
        Container.add(ApellidoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 80, -1));

        NombreTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        NombreTitle.setText("Nombre:");
        Container.add(NombreTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, -1));

        TipoTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        TipoTitle.setText("Tipo identificación:");
        Container.add(TipoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, -1));

        NroTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        NroTitle.setText("Nro de identificación:");
        Container.add(NroTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, -1));
        Container.add(Tipoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 30));
        Container.add(Nroid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 160, 30));

        CelularTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        CelularTitle.setText("Celular:");
        Container.add(CelularTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, -1));
        Container.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

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

        PassTitle.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        PassTitle.setText("Contraseña:");
        Container.add(PassTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 120, -1));
        Container.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, 30));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarUserMouseClicked
        
        int flag = 0;
        
        if(Nombre.getText().equals("") || 
                Apellido.getText().equals("") || 
                Tipoid.getText().equals("") || 
                Nroid.getText().equals("") ||
                Celular.getText().equals("") ||
                Password.getText().equals(""))
        {
            flag = 1;
        }
        
        
        
        if(flag == 0)
        {
            Informacion = 
                    Nombre.getText() + "," +
                    Apellido.getText() + "," +
                    Tipoid.getText() + "," +
                    Nroid.getText() + "," +
                    Celular.getText() + "," +
                    Password.getText();
            this.dispose();
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
    private javax.swing.JTextField Apellido;
    private javax.swing.JLabel ApellidoTitle;
    private javax.swing.JTextField Celular;
    private javax.swing.JLabel CelularTitle;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel EnviarUser;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JLabel NroTitle;
    private javax.swing.JTextField Nroid;
    private javax.swing.JLabel PassTitle;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel TipoTitle;
    private javax.swing.JTextField Tipoid;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}

