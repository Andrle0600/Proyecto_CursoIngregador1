package Vista;

import Controlador.ControladoraGeneral;
import Modelo.Producto;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GenerarReporte extends javax.swing.JFrame {

    ControladoraGeneral control;
    List<Producto> productos;

    public GenerarReporte() {
        initComponents();
        control = new ControladoraGeneral();
        productos = control.getControladoraProducto().leerTodo();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReporte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Generar Reporte");

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

        jtReporte.setBackground(new java.awt.Color(204, 204, 255));
        jtReporte.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtReporte.setForeground(new java.awt.Color(0, 0, 0));
        jtReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jtReporte.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtReporte);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Generar Reporte");

        btnGuardar.setBackground(new java.awt.Color(200, 76, 229));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Descargar Reporte");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        GestionInventario pant = new GestionInventario();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private ImageIcon loadImage(String imageName) {
        String imagePath = System.getProperty("user.dir") + "\\src\\main\\java\\Imagenes\\" + imageName;
        return new ImageIcon(imagePath);
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

    public String validarCategoria(Producto producto) {
        return (producto.getCategoria() == null) ? "-" : producto.getCategoria().getNombre();
    }

    public String validarProveedor(Producto producto) {
        return (producto.getProveedor() == null) ? "-" : producto.getProveedor().getNombre();
    }

    public double calcularPrecioVenta(Producto prod) {
        double compra = prod.getPrecioCompra();
        double ganancia = (prod.getCategoria() != null) ? prod.getCategoria().getGanancia() : 0;
        return compra * (1 + ganancia);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtReporte;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        // Inicializa el modelo de la tabla y establece las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"Producto", "Cantidad", "Precio de Compra", "Precio de Venta", "Categoria", "Proveedor"};
        modeloTabla.setColumnIdentifiers(titulos);
        modeloTabla.setRowCount(0);

        // Itera las productos
        for (Producto prod : productos) {
            Object[] obj = {
                prod.getNombre(),
                prod.getStock().getCantidad(),
                formatoSoles(prod.getPrecioCompra(), false),
                formatoSoles(calcularPrecioVenta(prod), true),
                validarCategoria(prod),
                validarProveedor(prod)
            };
            modeloTabla.addRow(obj);
        }

        jtReporte.setModel(modeloTabla);

        // Centra el texto en todas las celdas
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplica el render centrado a cada columna
        for (int i = 0; i < jtReporte.getColumnCount(); i++) {
            jtReporte.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }
}
