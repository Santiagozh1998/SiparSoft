package Vista.Formularios;

import javax.swing.JOptionPane;

public class FormFacturacion extends javax.swing.JFrame {
       
    private String Informacion = "";
    
    public FormFacturacion() {
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
        identificacion = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        numeroFactura = new javax.swing.JTextField();
        fechaFactura = new javax.swing.JTextField();
        nombreVendedor = new javax.swing.JTextField();
        idCliente = new javax.swing.JLabel();
        celularCliente = new javax.swing.JLabel();
        confirmarFactura = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        direccionCliente = new javax.swing.JLabel();
        numFactura = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        vendedor = new javax.swing.JLabel();
        Productos = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        codProducto = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        cant = new javax.swing.JLabel();
        precioUnd = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        totalSinIVA = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        tituloSiparsoft = new javax.swing.JPanel();
        tituloFactura = new javax.swing.JLabel();
        totalPago = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        totalPagar = new javax.swing.JLabel();

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
        TitleText.setText("Facturación");
        Title.add(TitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 350, -1));

        Container.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));
        Container.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, 20));
        Container.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, 20));
        Container.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, 20));
        Container.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, 20));
        Container.add(numeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 100, 20));

        fechaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFacturaActionPerformed(evt);
            }
        });
        Container.add(fechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 20));

        nombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreVendedorActionPerformed(evt);
            }
        });
        Container.add(nombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, 20));

        idCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        idCliente.setText("Identificación cliente:");
        Container.add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        celularCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        celularCliente.setText("Número celular:");
        Container.add(celularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, -1));

        confirmarFactura.setBackground(new java.awt.Color(0, 87, 146));
        confirmarFactura.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        confirmarFactura.setForeground(new java.awt.Color(255, 255, 255));
        confirmarFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmarFactura.setText("Confirmar");
        confirmarFactura.setOpaque(true);
        confirmarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarFacturaMouseClicked(evt);
            }
        });
        Container.add(confirmarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 200, 40));

        nombreCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        nombreCliente.setText("Nombre cliente:");
        Container.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, -1));

        direccionCliente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        direccionCliente.setText("Número de factura:");
        Container.add(direccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 140, -1));

        numFactura.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        numFactura.setText("Dirección:");
        Container.add(numFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        fecha.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        fecha.setText("Fecha facturación:");
        Container.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 20));

        vendedor.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendedor.setText("Vendedor:");
        Container.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 80, 20));

        Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(18, 146, 195));
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codProducto.setForeground(new java.awt.Color(255, 255, 255));
        codProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codProducto.setText("Código producto");
        barra.add(codProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcion.setText("Descripción");
        barra.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 120, 30));

        cant.setForeground(new java.awt.Color(255, 255, 255));
        cant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cant.setText("Cant");
        barra.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 60, 30));

        precioUnd.setForeground(new java.awt.Color(255, 255, 255));
        precioUnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioUnd.setText("Precio und");
        barra.add(precioUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, 30));

        iva.setForeground(new java.awt.Color(255, 255, 255));
        iva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iva.setText("IVA");
        barra.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 30));

        totalSinIVA.setForeground(new java.awt.Color(255, 255, 255));
        totalSinIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalSinIVA.setText("Total sin IVA");
        barra.add(totalSinIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 130, 30));

        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("Total");
        barra.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 100, 30));

        Productos.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        Container.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 740, 200));

        tituloSiparsoft.setBackground(new java.awt.Color(18, 146, 195));
        tituloSiparsoft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloFactura.setFont(new java.awt.Font("Ubuntu", 1, 32)); // NOI18N
        tituloFactura.setForeground(new java.awt.Color(255, 255, 255));
        tituloFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFactura.setText("SIPARSOFT");
        tituloSiparsoft.add(tituloFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 210, 50));

        Container.add(tituloSiparsoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 740, 50));

        totalPago.setBackground(new java.awt.Color(204, 204, 204));
        Container.add(totalPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 120, 30));

        jPanel1.setBackground(new java.awt.Color(18, 146, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPagar.setForeground(new java.awt.Color(255, 255, 255));
        totalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPagar.setText("TOTAL A PAGAR");
        jPanel1.add(totalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 140, 30));

        Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 620, 30));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarFacturaMouseClicked
        
        int flag = 0;
        
        
        
    }//GEN-LAST:event_confirmarFacturaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        Informacion = "Cerrada";
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void fechaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFacturaActionPerformed

    private void nombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreVendedorActionPerformed

    public String getInformacion() {
        
        return Informacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Productos;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleText;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel cant;
    private javax.swing.JTextField celular;
    private javax.swing.JLabel celularCliente;
    private javax.swing.JLabel codProducto;
    private javax.swing.JLabel confirmarFactura;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel direccionCliente;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaFactura;
    private javax.swing.JLabel idCliente;
    private javax.swing.JTextField identificacion;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JTextField nombreVendedor;
    private javax.swing.JLabel numFactura;
    private javax.swing.JTextField numeroFactura;
    private javax.swing.JLabel precioUnd;
    private javax.swing.JLabel tituloFactura;
    private javax.swing.JPanel tituloSiparsoft;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalPagar;
    private javax.swing.JPanel totalPago;
    private javax.swing.JLabel totalSinIVA;
    private javax.swing.JLabel vendedor;
    // End of variables declaration//GEN-END:variables

}

