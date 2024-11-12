package Vista;

import Controlador.ControladoraGeneral;
import Modelo.DetallePedido;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;

public class AgregarProductoPedido extends javax.swing.JFrame {

    ControladoraGeneral control;
    private Proveedor prov;
    private List<Producto> productos;
    private DetallePedido detalle;
    private Pedido ped;

    public AgregarProductoPedido(Proveedor provedor, Pedido pedido) {
        initComponents();
        control = new ControladoraGeneral();
        detalle = new DetallePedido();
        this.ped = pedido;
        this.prov = provedor;
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnVerPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Agregar Producto a Pedido");

        jPanel3.setBackground(new java.awt.Color(182, 127, 226));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Producto");

        comboProductos.setBackground(new java.awt.Color(190, 162, 221));
        comboProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboProductos.setForeground(new java.awt.Color(0, 0, 0));
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProductos, 0, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(182, 127, 226));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad");

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantidad.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(182, 127, 226));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio por Unidad");

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnAgregarProducto.setBackground(new java.awt.Color(102, 0, 102));
        btnAgregarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("AGREGAR PRODUCTO");
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.setMaximumSize(new java.awt.Dimension(100, 40));
        btnAgregarProducto.setPreferredSize(new java.awt.Dimension(100, 40));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseExited(evt);
            }
        });
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnVerPedido.setBackground(new java.awt.Color(200, 0, 180));
        btnVerPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnVerPedido.setText("VER PEDIDO");
        btnVerPedido.setBorderPainted(false);
        btnVerPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerPedidoMouseExited(evt);
            }
        });
        btnVerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        btnAgregarProducto.setBackground(new java.awt.Color(120, 0, 120));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        btnAgregarProducto.setBackground(new java.awt.Color(102, 0, 102));
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        //Recibir datos
        String producto = (String) comboProductos.getSelectedItem();
        Producto prodSelect = control.getControladoraProducto().leerPorNombre(producto);
        int cantidad = (int) spnCantidad.getValue();
        double precio = Double.parseDouble(txtPrecio.getText());
        double subtotal = cantidad * precio;
        //confirmación
        boolean conf = confirmar("¿Desea agregar este producto al pedido?");
        if (!conf) {
            mostrarMensaje("No se ha registrado este producto en el pedido", "informacion");
        } else {
            detalle.setProducto(prodSelect);
            detalle.setPedido(ped);
            detalle.setCantidad(cantidad);
            detalle.setSubtotal(subtotal);
            control.getControladoraDetallePedido().crearDetallePedido(detalle);
            //Actualizar el total del pedido
            double totalActual = ped.getTotal();
            double nuevoTotal = totalActual + subtotal;
            ped.setTotal(nuevoTotal);
            control.getControladoraPedido().actualizarPedido(ped);
            //Confirmar y reiniciar
            mostrarMensaje("Se agregado el producto al pedido", "informacion");
            spnCantidad.setValue(1);
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnVerPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPedidoMouseEntered
        btnVerPedido.setBackground(new java.awt.Color(225, 0, 205));
    }//GEN-LAST:event_btnVerPedidoMouseEntered

    private void btnVerPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPedidoMouseExited
        btnVerPedido.setBackground(new java.awt.Color(200, 0, 180));
    }//GEN-LAST:event_btnVerPedidoMouseExited

    private void btnVerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidoActionPerformed
        Pedido pedido=control.getControladoraPedido().leerPedido(ped.getIdPedido());
        VerDetallesPedido verDetalle = new VerDetallesPedido(pedido);
        verDetalle.setVisible(true);
        verDetalle.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVerPedidoActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed
        if (comboProductos.getSelectedIndex() > -1) {
            String producto = (String) comboProductos.getSelectedItem();
            Producto prodSelect = control.getControladoraProducto().leerPorNombre(producto);
            txtPrecio.setText(String.valueOf(prodSelect.getPrecioCompra()));
        }
    }//GEN-LAST:event_comboProductosActionPerformed

    public boolean confirmar(String mensaje) {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                mensaje,
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        return (respuesta == JOptionPane.YES_OPTION);
    }

    private static void mostrarMensaje(String mensaje, String tipo) {
        int tipoMensaje;

        tipoMensaje = switch (tipo.toLowerCase()) {
            case "error" ->
                JOptionPane.ERROR_MESSAGE;
            case "informacion" ->
                JOptionPane.INFORMATION_MESSAGE;
            case "advertencia" ->
                JOptionPane.WARNING_MESSAGE;
            case "pregunta" ->
                JOptionPane.QUESTION_MESSAGE;
            default ->
                JOptionPane.PLAIN_MESSAGE;
        };

        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", tipoMensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnVerPedido;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    public void cargarProductos() {
        comboProductos.removeAllItems();
        productos = prov.getProductos();
        for (Producto producto : productos) {
            comboProductos.addItem(producto.getNombre());
        }
    }
}
