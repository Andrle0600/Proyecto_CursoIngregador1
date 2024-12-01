package Vista;

import Controlador.ControladoraGeneral;
import Modelo.Categoria;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Stock;
import com.google.common.base.Strings;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

public class ActualizarInventario extends javax.swing.JFrame {

    ControladoraGeneral control;
    List<Proveedor> proveedores;
    List<Categoria> categorias;
    Categoria categoria;
    Proveedor proveedor;
    Producto prod;

    public ActualizarInventario() {
        initComponents();
        control = new ControladoraGeneral();
        prod = new Producto();
        proveedores = control.getControladoraProveedor().leerTodo();
        categorias = control.getControladoraCategoria().leerTodo();
        cargarProveedores();
        cargarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        comboCategoria = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Actualizar Inventario");

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

        txtCantidad.setBackground(new java.awt.Color(204, 204, 255));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPrecioUnitario.setBackground(new java.awt.Color(204, 204, 255));
        txtPrecioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        comboCategoria.setBackground(new java.awt.Color(204, 204, 255));
        comboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setBackground(new java.awt.Color(102, 0, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Actualizar Inventario");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Producto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad Actual:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Categoría:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio de Compra:");

        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Proveedor:");

        comboProveedor.setBackground(new java.awt.Color(204, 204, 255));
        comboProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboProveedor.setForeground(new java.awt.Color(0, 0, 0));
        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addComponent(comboCategoria, 0, 280, Short.MAX_VALUE)
                                        .addComponent(comboProveedor, 0, 280, Short.MAX_VALUE))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                //cargar datos
                txtNombre.setText(prod.getNombre());
                txtCantidad.setText(String.valueOf(prod.getStock().getCantidad()));
                txtPrecioUnitario.setText(String.valueOf((float) prod.getPrecioCompra()));
                comboCategoria.setSelectedItem(prod.getCategoria().getNombre());
                comboProveedor.setSelectedItem(prod.getProveedor().getNombre());
                //Reiniciar placeholder
                txtBuscarProducto.setText("Buscar producto por código");
                txtBuscarProducto.setForeground(new Color(102, 102, 102));
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validar
        String nombre = StringUtils.trim(txtNombre.getText());
        String precio = StringUtils.trim(txtPrecioUnitario.getText());
        String cantidad = StringUtils.trim(txtCantidad.getText());

        if (!camposObligatorios(nombre, cantidad, precio)) {
            mostrarMensaje("Nombre, precio y cantidad son obligatorios", "error");
            return;
        }

        double precioValidado = validarPrecio(precio);
        if (precioValidado == 0) {
            mostrarMensaje("El precio es un número.\nEl decimal debe ser con punto, no con coma.\nEjm: 0.7", "error");
            return;
        }
        int cantidadValidada = validarCantidad(cantidad);
        if (cantidadValidada == -1) {
            mostrarMensaje("La cantidad debe ser un número", "error");
            return;
        }
        //obtener proveedor y categoria
        String cat = (String) comboCategoria.getSelectedItem();
        categoria = control.getControladoraCategoria().leerPorNombre(cat);
        String prov = (String) comboProveedor.getSelectedItem();
        proveedor = control.getControladoraProveedor().leerPorNombre(prov);
        //codigo
        /*Traer los productos de la categoria*/
        List<Producto> productos = control.getControladoraProducto().leerPorCategoria(categoria);
        String codigo = generarCodigo(proveedor, categoria, productos);
        //Actualizar stock
        Stock stock = prod.getStock();
        stock.setCantidad(cantidadValidada);
        control.getControladoraStock().actualizarStock(stock);
        //añadir datos
        prod.setNombre(nombre);
        prod.setPrecioCompra(precioValidado);
        prod.setCodigo(codigo);
        prod.setStock(stock);
        prod.setCategoria(categoria);
        prod.setProveedor(proveedor);
        //actaulizar
        control.getControladoraProducto().actualizarProducto(prod);
        mostrarMensaje("Producto actualizado", "informacion");
        GestionInventario pant = new GestionInventario();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private double validarPrecio(String texto) {
        String sinEspacio = StringUtils.trim(texto);
        try {
            Double numero = Double.valueOf(sinEspacio);
            return numero;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private int validarCantidad(String texto) {
        String sinEspacio = StringUtils.trim(texto);
        try {
            int numero = Integer.parseInt(sinEspacio);
            if (numero < 0) {
                return -1;
            }
            return numero;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private boolean camposObligatorios(String nombre, String cantidad, String precio) {
        return !nombre.isEmpty() && !cantidad.isEmpty() && !precio.isEmpty();
    }

    private String generarCodigo(Proveedor proveedor, Categoria categoria, List<Producto> productos) {
        String codigo = "EST";
        String cat = categoria.getNombre().substring(0, 3).toUpperCase();
        int num = productos.size() + 1;
        String indice = String.format("%03d", num);
        String prov = proveedor.getNombre().substring(0, 3).toUpperCase();
        return codigo + cat + indice + prov;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores() {
        comboProveedor.removeAllItems();
        for (Proveedor provedor : proveedores) {
            comboProveedor.addItem(provedor.getNombre());
        }
    }

    private void cargarCategorias() {
        comboCategoria.removeAllItems();
        for (Categoria cat : categorias) {
            comboCategoria.addItem(cat.getNombre());
        }
    }

}
