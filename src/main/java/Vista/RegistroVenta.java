package Vista;

import Controlador.ControladoraGeneral;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Stock;
import Modelo.Venta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

public class RegistroVenta extends javax.swing.JFrame {

    ControladoraGeneral control;
    Venta venta;
    Producto producto;
    List<DetalleVenta> detalles;
    DetalleVenta detalle;
    int pantalla;

    public RegistroVenta(Venta venta, int pantalla) {
        initComponents();
        cargarFecha();
        this.control = new ControladoraGeneral();
        this.detalle = new DetalleVenta();
        this.venta = venta;
        this.pantalla = pantalla;
        setTextoInformacion();
        cargarTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextPane();
        txtPrecio = new javax.swing.JTextField();
        btnFinalizarCompra = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Venta");
        setBackground(new java.awt.Color(155, 89, 182));

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del Cliente:");

        btnAñadir.setBackground(new java.awt.Color(220, 20, 200));
        btnAñadir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        txtNombreCliente.setBackground(new java.awt.Color(210, 182, 241));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtCodigo.setBackground(new java.awt.Color(210, 182, 241));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo del Producto:");

        txtNombreProducto.setBackground(new java.awt.Color(190, 162, 221));
        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        txtFecha.setBackground(new java.awt.Color(190, 162, 221));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFecha.setEnabled(false);

        txtInformacion.setEditable(false);
        txtInformacion.setBackground(new java.awt.Color(190, 162, 221));
        txtInformacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtInformacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtInformacion);

        txtPrecio.setBackground(new java.awt.Color(190, 162, 221));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);

        btnFinalizarCompra.setBackground(new java.awt.Color(220, 20, 200));
        btnFinalizarCompra.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnFinalizarCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarCompra.setText("FINALIZAR VENTA");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio de Venta:");

        btnCancelar.setBackground(new java.awt.Color(220, 20, 200));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR VENTA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

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

        jPanel2.setBackground(new java.awt.Color(182, 127, 226));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtTotal.setBackground(new java.awt.Color(190, 162, 221));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total:");

        txtEfectivo.setBackground(new java.awt.Color(210, 182, 241));
        txtEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEfectivo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyPressed(evt);
            }
        });

        txtCambio.setBackground(new java.awt.Color(190, 162, 221));
        txtCambio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCambio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCambio.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cambio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Efectivo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEfectivo)
                    .addComponent(txtTotal)
                    .addComponent(txtCambio))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreProducto)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGap(36, 36, 36))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 431, Short.MAX_VALUE)))
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

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(120, 0, 120));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(102, 0, 102));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        detalles = control.getControladoraDetalleVenta().leerPorVenta(venta);
        if (detalles.isEmpty()) {
            boolean conf = confirmar("¿Desea cancelar el registro de la venta?");
            if (conf) {
                if (pantalla == 1) {
                    GestionVentas ventas = new GestionVentas();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    PantallaPrincipalUsuario ventas=new PantallaPrincipalUsuario();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        } else {
            mostrarMensaje("Finalice o cancele la venta", "adventencia");
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String codigo = txtCodigo.getText();
            producto = control.getControladoraProducto().leerPorCodigo(codigo);
            //Obteniendo nombre y calculando precio
            String nombre = producto.getNombre();
            double precioCompra = producto.getPrecioCompra();
            double ganancia = producto.getCategoria().getGanancia();
            double precioVenta = precioCompra * (1 + ganancia);
            //Establecer en los campos
            txtNombreProducto.setText(nombre);
            txtPrecio.setText(formatoSoles(precioVenta, true));
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        detalles = control.getControladoraDetalleVenta().leerPorVenta(venta);
        if (detalles.isEmpty()) {
            mostrarMensaje("La venta no tiene productos", "advertencia");
        } else {
            boolean conf = confirmar("¿Desea finalizar la venta?");
            if (conf) {
                String cliente = txtNombreCliente.getText();
                if (cliente.equals("")) {
                    cliente = "Cliente";
                }
                venta.setCliente(cliente);
                control.getControladoraVenta().actualizarVenta(venta);
                for (DetalleVenta det : detalles) {
                    int cantActual = det.getProducto().getStock().getCantidad();
                    int nuevo = cantActual - detalle.getCantidad();
                    Stock stock = det.getProducto().getStock();
                    stock.setCantidad(nuevo);
                    control.getControladoraStock().actualizarStock(stock);
                }
                if (pantalla == 1) {
                    GestionVentas ventas = new GestionVentas();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    PantallaPrincipalUsuario ventas=new PantallaPrincipalUsuario();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        detalles = control.getControladoraDetalleVenta().leerPorVenta(venta);
        if (detalles.isEmpty()) {
            if (pantalla == 1) {
                    GestionVentas ventas = new GestionVentas();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    PantallaPrincipalUsuario ventas=new PantallaPrincipalUsuario();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }
        } else {
            boolean conf = confirmar("Se eliminará la venta completa, ¿Desea continuar?");
            if (conf) {
                detalles = control.getControladoraDetalleVenta().leerPorVenta(venta);
                for (DetalleVenta det : detalles) {
                    control.getControladoraDetalleVenta().eliminarDetalleVenta(det.getIdDetalleVenta());
                }
                control.getControladoraVenta().eliminarVenta(venta.getIdVenta());
                if (pantalla == 1) {
                    GestionVentas ventas = new GestionVentas();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    PantallaPrincipalUsuario ventas=new PantallaPrincipalUsuario();
                    ventas.setVisible(true);
                    ventas.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        //Obtener datos
        String codigo = txtCodigo.getText();
        producto = control.getControladoraProducto().leerPorCodigo(codigo);
        Object valor = spnCantidad.getValue();
        int cantidad;
        try {
            // Verificar si el valor es un entero
            if (valor instanceof Integer) {
                cantidad = (int) valor; // Ya es un número entero, así que puedes asignarlo
            } else {
                throw new NumberFormatException("Valor no numérico");
            }
        } catch (NumberFormatException e) {
            mostrarMensaje("No se permite el valor no numérico", "error");
            return;
        }
        //calcular subtotal
        double precio = obtenerPrecioLimpio(txtPrecio.getText());
        double subtotal = cantidad * precio;

        //confirmación
        boolean conf = confirmar("¿Desea agregar este producto a la venta?");
        if (!conf) {
            mostrarMensaje("No se ha registrado este producto en la venta", "informacion");
        } else {
            detalle.setProducto(producto);
            detalle.setCantidad(cantidad);
            detalle.setSubtotal(subtotal);
            detalle.setVenta(venta);
            control.getControladoraDetalleVenta().crearDetalleVenta(detalle);
            //Actualizar el total del pedido
            double totalActual = venta.getTotal();
            double nuevoTotal = totalActual + subtotal;
            venta.setTotal(nuevoTotal);
            control.getControladoraVenta().actualizarVenta(venta);
            //confimar y reinicar
            mostrarMensaje("Se agregado el producto a la venta", "informacion");
            limpiar();
            cargarTotal();
            añadirInformacion(producto, cantidad, precio);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String numEfectivo = StringUtils.trim(txtEfectivo.getText());
            if (!esNumeroDecimal(numEfectivo)) {
                mostrarMensaje("Ingrese un número. Los decimales son con punto, no con coma", "error");
                txtEfectivo.setText("");
                return;
            }
            double total = obtenerPrecioLimpio(txtTotal.getText());
            double efectivo = Double.parseDouble(txtEfectivo.getText());
            //calcular el cambio
            double cambio = efectivo - total;
            if (cambio > 0) {
                //Establecer en los campos
                txtEfectivo.setText(formatoSoles(efectivo, false));
                txtCambio.setText(formatoSoles(cambio, false));
            } else {
                mostrarMensaje("Efectivo insuficiente", "error");
                txtEfectivo.setText("");
            }
        }
    }//GEN-LAST:event_txtEfectivoKeyPressed

    private ImageIcon loadImage(String imageName) {
        String imagePath = System.getProperty("user.dir") + "\\src\\main\\java\\Imagenes\\" + imageName;
        return new ImageIcon(imagePath);
    }

    private void cargarFecha() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatear la fecha (puedes cambiar el formato según tus necesidades)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formatter);

        // Establecer la fecha en el cuadro de texto
        txtFecha.setText(fechaFormateada);
    }

    public String formatoSoles(double cantidad, boolean redondear) {
        // Si no se debe redondear, devolver el valor con 2 decimales
        if (!redondear) {
            return String.format("S/. %.2f", cantidad);
        }

        // Redondear el valor a múltiplos válidos
        double redondeado = Math.round(cantidad * 10) / 10.0;
        double decimal = redondeado - Math.floor(redondeado);

        if (decimal > 0 && decimal < 0.05) {
            redondeado = Math.floor(redondeado); // Redondear hacia abajo
        } else if (decimal > 0.05) {
            redondeado = Math.ceil(redondeado * 2) / 2; // Redondear hacia el múltiplo más cercano de 0.5
        }

        // Formatear en soles
        return String.format("S/. %.2f", redondeado);
    }

    private double obtenerPrecioLimpio(String textoPrecio) {
        if (textoPrecio == null || !textoPrecio.startsWith("S/.")) {
            throw new IllegalArgumentException("El texto proporcionado no tiene el formato esperado: 'S/.'.");
        }
        // Eliminar el prefijo "S/." y convertir a double
        return Double.parseDouble(textoPrecio.replace("S/.", "").trim());
    }

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

    private void limpiar() {
        txtCodigo.setText("");
        txtNombreProducto.setText("");
        txtPrecio.setText("");
        spnCantidad.setValue(1);
    }

    private boolean esNumeroDecimal(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextPane txtInformacion;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void cargarTotal() {
        double total = venta.getTotal();
        txtTotal.setText(formatoSoles(total, false));
    }

    private void setTextoInformacion() {
        txtInformacion.setText("********Papelería Estdiel********");
    }

    private void añadirInformacion(Producto producto, int cantidad, double precio) {
        String nuevoProducto = txtInformacion.getText() + "\n"
                + producto.getCodigo() + " " + producto.getNombre() + "\n"
                + "\t\t" + cantidad + "x\t" + precio + "\t" + formatoSoles(cantidad * precio, false);
        txtInformacion.setText(nuevoProducto);
    }
}
