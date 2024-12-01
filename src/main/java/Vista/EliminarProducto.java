package Vista;

import Controlador.ControladoraGeneral;
import Modelo.Categoria;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class EliminarProducto extends javax.swing.JFrame {

    ControladoraGeneral control;
    List<Proveedor> proveedores;
    List<Categoria> categorias;
    Categoria categoria;
    Proveedor proveedor;
    Producto prod;

    public EliminarProducto() {
        initComponents();
        control = new ControladoraGeneral();
        prod = new Producto();
        proveedores = control.getControladoraProveedor().leerTodo();
        categorias = control.getControladoraCategoria().leerTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Producto");

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

        btnCancelar.setBackground(new java.awt.Color(102, 0, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtBuscarProducto.setBackground(new java.awt.Color(204, 204, 255));
        txtBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarProducto.setText("Buscar producto por código");
        txtBuscarProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarProductoFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Eliminar producto");

        btnBuscar.setBackground(new java.awt.Color(102, 0, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtInfo.setBackground(new java.awt.Color(204, 204, 255));
        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInfo.setForeground(new java.awt.Color(0, 0, 0));
        txtInfo.setRows(5);
        txtInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Información de la Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(txtInfo);

        btnEliminar.setBackground(new java.awt.Color(102, 0, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(24, 24, 24))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnEliminar)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelar)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscarProducto.getText().equals("") || txtBuscarProducto.getText().equals("Buscar producto por código")) {
            mostrarMensaje("Escriba el proveedor a buscar", "error");
        } else {
            prod = control.getControladoraProducto().leerPorCodigo(txtBuscarProducto.getText());
            if (prod == null) {
                mostrarMensaje("Código no registrado", "error");
                txtBuscarProducto.setText("Buscar producto por código");
                txtBuscarProducto.setForeground(new Color(102, 102, 102));
            } else {
                generarTexto(prod);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        GestionInventario pant = new GestionInventario();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarProductoFocusGained
        if (txtBuscarProducto.getText().equals("Buscar producto por código")) {
            txtBuscarProducto.setText("");
            txtBuscarProducto.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBuscarProductoFocusGained

    private void txtBuscarProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarProductoFocusLost
        if (txtBuscarProducto.getText().equals("")) {
            txtBuscarProducto.setText("Buscar producto por código");
            txtBuscarProducto.setForeground(new Color(102, 102, 102));
        } else {
            txtBuscarProducto.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBuscarProductoFocusLost

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean conf = confirmar("El producto aparecerá como descontinuado en todas las referencias que tenga.\n¿Desea proceder con la eliminación?");
        if (conf) {
            control.getControladoraProducto().eliminarProducto(prod.getIdProducto());
            mostrarMensaje("El producto fue eliminado", "informacion");
            GestionInventario pant = new GestionInventario();
            pant.setVisible(true);
            pant.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables

    private void generarTexto(Producto prod) {
        String nom = "El nombre es: " + prod.getNombre() + "\n";
        String cant = "Su cantidad actual es: " + prod.getStock().getCantidad() + "\n";
        String prov = "Su proveedor es: " + prod.getProveedor().getNombre() + "\n";
        String cat = "Su categoria es: " + prod.getCategoria().getNombre() + "\n";
        String prec = "Su precio es: " + formatoSoles(prod.getPrecioCompra(), false);
        txtInfo.setText(nom + cant + prov + cat + prec);
    }
}
