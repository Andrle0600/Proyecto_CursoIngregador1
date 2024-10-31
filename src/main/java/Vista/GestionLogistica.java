package Vista;

import javax.swing.ImageIcon;

public class GestionLogistica extends javax.swing.JFrame {

    public GestionLogistica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bckg = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Logística - Pantalla Principal");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));

        bckg.setBackground(new java.awt.Color(182, 127, 226));
        bckg.setMaximumSize(new java.awt.Dimension(500, 400));
        bckg.setMinimumSize(new java.awt.Dimension(500, 400));
        bckg.setPreferredSize(new java.awt.Dimension(500, 400));

        panelTitulo.setBackground(new java.awt.Color(182, 127, 226));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Papelería \"Estdiel\"");

        jLabel1.setIcon(loadImage("papeleria_50x50.png"));

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btnVolver.setBackground(new java.awt.Color(102, 0, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(loadImage("btn_volver.png"));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setMaximumSize(new java.awt.Dimension(500, 300));
        btnVolver.setMinimumSize(new java.awt.Dimension(80, 30));
        btnVolver.setPreferredSize(new java.awt.Dimension(80, 30));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnPedidos.setBackground(new java.awt.Color(200, 76, 229));
        btnPedidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(0, 0, 0));
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setBorderPainted(false);
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPedidosMouseExited(evt);
            }
        });
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(200, 76, 229));
        btnProveedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(0, 0, 0));
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
        });
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bckgLayout = new javax.swing.GroupLayout(bckg);
        bckg.setLayout(bckgLayout);
        bckgLayout.setHorizontalGroup(
            bckgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckgLayout.createSequentialGroup()
                .addGroup(bckgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bckgLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bckgLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(bckgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bckgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );
        bckgLayout.setVerticalGroup(
            bckgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(120, 0, 120));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(102, 0, 102));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PantallaPrincipal pant=new PantallaPrincipal();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseEntered
        btnPedidos.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnPedidosMouseEntered

    private void btnPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseExited
        btnPedidos.setBackground(new java.awt.Color(200,76,229));
    }//GEN-LAST:event_btnPedidosMouseExited

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        btnProveedores.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        btnProveedores.setBackground(new java.awt.Color(200,76,229));
    }//GEN-LAST:event_btnProveedoresMouseExited

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        PantallaProveedores prov=new PantallaProveedores();
        prov.setVisible(true);
        prov.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        ListarPedidos listar=new ListarPedidos();
        listar.setVisible(true);
        listar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private ImageIcon loadImage(String imageName) {
        String imagePath = System.getProperty("user.dir") + "\\src\\main\\java\\Imagenes\\" + imageName;
        return new ImageIcon(imagePath);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckg;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
