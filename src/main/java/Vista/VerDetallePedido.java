package Vista;

import Controlador.ControladoraGeneral;
import Modelo.DetallePedido;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Stock;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VerDetallePedido extends javax.swing.JFrame {

    ControladoraGeneral control;
    Pedido ped;
    List<DetallePedido> detalles;

    public VerDetallePedido(Pedido pedido) {
        this.ped = pedido;
        initComponents();
        control = new ControladoraGeneral();
        detalles = control.getControladoraDetallePedido().leerPorPedido(ped);
        cargarDetalles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnCambiarEstado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalles = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnEditarCantidad = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

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

        btnCambiarEstado.setBackground(new java.awt.Color(102, 0, 102));
        btnCambiarEstado.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnCambiarEstado.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarEstado.setText("CAMBIAR ESTADO");
        btnCambiarEstado.setBorderPainted(false);
        btnCambiarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarEstado.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCambiarEstado.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCambiarEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarEstadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarEstadoMouseExited(evt);
            }
        });
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pedido al Proveedor: "+ped.getProveedor().getNombre());

        jtDetalles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDetalles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtDetalles);

        btnAgregarProducto.setBackground(new java.awt.Color(200, 76, 229));
        btnAgregarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(0, 0, 0));
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

        btnEditarCantidad.setBackground(new java.awt.Color(200, 76, 229));
        btnEditarCantidad.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnEditarCantidad.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarCantidad.setText("EDITAR CANTIDAD");
        btnEditarCantidad.setBorderPainted(false);
        btnEditarCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCantidad.setMaximumSize(new java.awt.Dimension(100, 40));
        btnEditarCantidad.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEditarCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarCantidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarCantidadMouseExited(evt);
            }
        });
        btnEditarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCantidadActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(200, 76, 229));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setText("ELIMINAR PRODUCTO");
        btnEliminarProducto.setBorderPainted(false);
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.setMaximumSize(new java.awt.Dimension(100, 40));
        btnEliminarProducto.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseExited(evt);
            }
        });
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnEliminarPedido.setBackground(new java.awt.Color(200, 76, 229));
        btnEliminarPedido.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnEliminarPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarPedido.setText("ELIMINAR PEDIDO");
        btnEliminarPedido.setBorderPainted(false);
        btnEliminarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPedido.setMaximumSize(new java.awt.Dimension(100, 40));
        btnEliminarPedido.setPreferredSize(new java.awt.Dimension(100, 40));
        btnEliminarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarPedidoMouseExited(evt);
            }
        });
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ESTADO:");

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(190, 162, 221));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(btnEditarCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void btnCambiarEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarEstadoMouseEntered
        btnCambiarEstado.setBackground(new java.awt.Color(120, 0, 120));
    }//GEN-LAST:event_btnCambiarEstadoMouseEntered

    private void btnCambiarEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarEstadoMouseExited
        btnCambiarEstado.setBackground(new java.awt.Color(102, 0, 102));
    }//GEN-LAST:event_btnCambiarEstadoMouseExited

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        boolean conf = confirmar("¿Desea camibar el estado del pedido?");
        if (conf) {
            List<String> opciones = Arrays.asList("Confirmado", "En Camino", "Recibido", "Cancelado");
            String opc = mostrarOpciones(opciones, "Elija el nuevo estado del pedido");
            boolean cambio = confirmar("¿Desea cambiar el estado a " + "\"" + opc + "\"" + "?");
            if (cambio) {
                ped.setEstado(opc);
                control.getControladoraPedido().actualizarPedido(ped);
                if (opc.equals("Recibido")) {
                    for (DetallePedido detalle : detalles) {
                        int actual = detalle.getProducto().getStock().getCantidad();
                        int nuevo = actual + detalle.getCantidad();
                        Stock stock = detalle.getProducto().getStock();
                        stock.setCantidad(nuevo);
                        control.getControladoraStock().actualizarStock(stock);
                    }
                }
                ListarPedidos log = new ListarPedidos();
                log.setVisible(true);
                log.setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        btnAgregarProducto.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        btnAgregarProducto.setBackground(new java.awt.Color(200, 76, 229));
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        AgregarProductoPedido agregar = new AgregarProductoPedido(ped.getProveedor(), ped, 2);
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnEditarCantidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCantidadMouseEntered
        btnEditarCantidad.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnEditarCantidadMouseEntered

    private void btnEditarCantidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCantidadMouseExited
        btnEditarCantidad.setBackground(new java.awt.Color(200, 76, 229));
    }//GEN-LAST:event_btnEditarCantidadMouseExited

    private void btnEditarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCantidadActionPerformed
        if (jtDetalles.getRowCount() > 0) {
            int filaSelect = jtDetalles.getSelectedRow();
            if (filaSelect != -1) {
                DetallePedido detalleSelect = detalles.get(filaSelect);
                ModificarDetallePedido modif = new ModificarDetallePedido(detalleSelect.getIdDetallePedido(), ped, 2);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("Seleccione la fila a editar", "advertencia");
            }
        }
    }//GEN-LAST:event_btnEditarCantidadActionPerformed

    private void btnEliminarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseEntered
        btnEliminarProducto.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnEliminarProductoMouseEntered

    private void btnEliminarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseExited
        btnEliminarProducto.setBackground(new java.awt.Color(200, 76, 229));
    }//GEN-LAST:event_btnEliminarProductoMouseExited

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (jtDetalles.getRowCount() > 0) {
            int filaSelect = jtDetalles.getSelectedRow();
            //Asegurar selección
            if (filaSelect != -1) {
                DetallePedido detalleSelect = detalles.get(filaSelect);
                boolean conf = confirmar("¿Desea eliminar este elemento del pedido?");
                if (conf) {
                    double subtotal = detalleSelect.getSubtotal();
                    double total = ped.getTotal();
                    double nTotal = total - subtotal;
                    ped.setTotal(nTotal);
                    control.getControladoraPedido().actualizarPedido(ped);
                    control.getControladoraDetallePedido().eliminarDetallePedido(detalleSelect.getIdDetallePedido());
                    detalles.remove(filaSelect);
                    cargarDetalles();
                }
            } else {
                mostrarMensaje("Seleccione la fila a eliminar", "advertencia");
            }
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnEliminarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPedidoMouseEntered
        btnEliminarPedido.setBackground(new java.awt.Color(220, 96, 249));
    }//GEN-LAST:event_btnEliminarPedidoMouseEntered

    private void btnEliminarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPedidoMouseExited
        btnEliminarPedido.setBackground(new java.awt.Color(200, 76, 229));
    }//GEN-LAST:event_btnEliminarPedidoMouseExited

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
        boolean conf = confirmar("Se eliminará el pedido completo, ¿Desea continuar?");
        if (conf) {
            for (DetallePedido detalle : detalles) {
                control.getControladoraDetallePedido().eliminarDetallePedido(detalle.getIdDetallePedido());
            }
            control.getControladoraPedido().eliminarPedido(ped.getIdPedido());
            ListarPedidos log = new ListarPedidos();
            log.setVisible(true);
            log.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(120, 0, 120));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(102, 0, 102));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ListarPedidos log = new ListarPedidos();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cargarDetalles() {
        //cargar el estado
        String estado = ped.getEstado();
        txtEstado.setText(estado);
        // Inicializa el modelo de la tabla y establece las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"Producto", "Cantidad", "Precio", "Subtotal"};
        modeloTabla.setColumnIdentifiers(titulos);
        modeloTabla.setRowCount(0);

        // Itera sobre los detalles y los agrega a la tabla
        for (DetallePedido detalle : detalles) {
            Object[] obj = {
                detalle.getProducto().getNombre(),
                detalle.getCantidad(),
                formatoSoles(detalle.getProducto().getPrecioCompra()),
                formatoSoles(detalle.getSubtotal())
            };
            modeloTabla.addRow(obj);
        }

        jtDetalles.setModel(modeloTabla);

        // Centra el texto en todas las celdas
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplica el render centrado a cada columna
        for (int i = 0; i < jtDetalles.getColumnCount(); i++) {
            jtDetalles.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }

    private ImageIcon loadImage(String imageName) {
        String path = "/Imagenes/" + imageName;
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("No se encontró la imagen: " + path);
            return null;
        }
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

    public String formatoSoles(double cantidad) {
        return String.format("S/. %.2f", cantidad);
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

    public static String mostrarOpciones(List<String> opciones, String mensaje) {
        // Convertimos la lista a un arreglo de String para usar en el JOptionPane
        String[] opcionesArray = opciones.toArray(new String[0]);

        // Mostramos el diálogo de selección
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                mensaje,
                "Seleccione una opción",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesArray,
                opcionesArray[0] // Selección inicial por defecto
        );

        return seleccion; // Retornamos la opción seleccionada o null si no se seleccionó ninguna
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnEditarCantidad;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDetalles;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}
