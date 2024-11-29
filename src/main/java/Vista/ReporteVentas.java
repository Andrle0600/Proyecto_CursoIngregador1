package Vista;

import Controlador.ControladoraGeneral;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Venta;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ReporteVentas extends javax.swing.JFrame {

    ControladoraGeneral control;
    List<Venta> ventas;
    Date inicio, fin;

    public ReporteVentas(Date inicio, Date fin, List<Venta> ventas) {
        this.inicio = inicio;
        this.fin = fin;
        initComponents();
        control = new ControladoraGeneral();
        this.ventas = ventas;
        colocarDatos();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMasVendido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reporte de Ventas");
        setBackground(new java.awt.Color(182, 127, 226));

        jPanel1.setBackground(new java.awt.Color(182, 127, 226));

        txtTotal.setBackground(new java.awt.Color(190, 162, 221));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.setEnabled(false);

        txtPromedio.setBackground(new java.awt.Color(190, 162, 221));
        txtPromedio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPromedio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPromedio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ventas desde "+formatearFecha(inicio)+" hasta "+formatearFecha(fin));

        txtMasVendido.setBackground(new java.awt.Color(190, 162, 221));
        txtMasVendido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMasVendido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMasVendido.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total de Ventas:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Producto Mas Vendido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero de Transacciones:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Promedio Diario de Ventas:");

        txtNumero.setBackground(new java.awt.Color(190, 162, 221));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNumero.setEnabled(false);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total de Días:");

        txtDias.setBackground(new java.awt.Color(190, 162, 221));
        txtDias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDias.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDias.setEnabled(false);

        jtProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jtProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jtProductos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos Vendidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMasVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMasVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
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
        GestionVentas gest = new GestionVentas();
        gest.setVisible(true);
        gest.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private ImageIcon loadImage(String imageName) {
        String imagePath = System.getProperty("user.dir") + "\\src\\main\\java\\Imagenes\\" + imageName;
        return new ImageIcon(imagePath);
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

    private long calcularDias(Date fechaInicial, Date fechaFinal) {
        if (fechaInicial == null || fechaFinal == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }

        // Convertir java.util.Date a LocalDate
        LocalDate Finicio = fechaInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate Ffin = fechaFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Calcular los días incluyendo ambas fechas
        return ChronoUnit.DAYS.between(Finicio, Ffin) + 1;
    }

    public static String formatearFecha(Date fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }

        // Crear el formato deseado
        SimpleDateFormat formato = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());

        // Retornar la fecha formateada
        return formato.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtMasVendido;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void colocarDatos() {
        String numero = String.valueOf(ventas.size());
        double total = calcularTotal(ventas);
        int diasEntre = (int) calcularDias(inicio, fin);
        double promedio = total / diasEntre;
        Producto prod = masVendido(ventas);

        //setear valores
        txtNumero.setText(numero);
        txtTotal.setText(formatoSoles(total, false));
        txtPromedio.setText(formatoSoles(promedio, true));
        txtDias.setText(String.valueOf(diasEntre));
        txtMasVendido.setText(prod.getNombre());

    }

    private double calcularTotal(List<Venta> ventas) {
        double total = 0;
        for (Venta vent : ventas) {
            double monto = vent.getTotal();
            total += monto;
        }
        return total;
    }

    private Producto masVendido(List<Venta> ventas) {
        // Mapa para registrar las cantidades totales vendidas por producto
        Map<Producto, Integer> totalPorProducto = new HashMap<>();

        // Iterar sobre cada venta
        for (Venta venta : ventas) {
            List<DetalleVenta> detalles = venta.getDetallesVenta();

            // Iterar sobre cada detalle de la venta
            for (DetalleVenta detalle : detalles) {
                Producto producto = detalle.getProducto();
                int cantidad = detalle.getCantidad();

                // Sumar la cantidad al total del producto en el mapa
                totalPorProducto.put(producto,
                        totalPorProducto.getOrDefault(producto, 0) + cantidad);
            }
        }

        // Determinar el producto más vendido
        Producto masVendido = null;
        int maxCantidad = 0;

        for (Map.Entry<Producto, Integer> entry : totalPorProducto.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();

            if (cantidad > maxCantidad) {
                masVendido = producto;
                maxCantidad = cantidad;
            }
        }
        return masVendido;
    }

    private List<Producto> obtenerProductosUnicos(List<Venta> ventas) {
        // Usamos un Set para evitar productos repetidos
        Set<Producto> productosUnicos = new HashSet<>();

        // Iterar sobre cada venta
        for (Venta venta : ventas) {
            List<DetalleVenta> detalles = venta.getDetallesVenta();

            // Iterar sobre cada detalle de la venta
            for (DetalleVenta detalle : detalles) {
                Producto producto = detalle.getProducto();
                productosUnicos.add(producto); // Añadimos al Set
            }
        }

        // Convertir el Set a una Lista y devolver
        return new ArrayList<>(productosUnicos);
    }

    private int cantidadTotalDeProducto(List<Venta> ventas, Producto productoBuscado) {
        int cantidadTotal = 0;

        // Iterar sobre cada venta
        for (Venta venta : ventas) {
            List<DetalleVenta> detalles = venta.getDetallesVenta();

            // Iterar sobre cada detalle de la venta
            for (DetalleVenta detalle : detalles) {
                Producto producto = detalle.getProducto();

                // Verificar si el producto del detalle coincide con el producto buscado
                if (producto.equals(productoBuscado)) {
                    cantidadTotal += detalle.getCantidad();
                }
            }
        }

        return cantidadTotal;
    }

    private void cargarTabla() {
        List<Producto> productos=obtenerProductosUnicos(ventas);

        // Inicializa el modelo de la tabla y establece las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"Producto", "Cantidad"};
        modeloTabla.setColumnIdentifiers(titulos);
        modeloTabla.setRowCount(0);

        // Itera las productos
        for (Producto prod:productos) {
            Object[] obj = {
                prod.getNombre(),
                cantidadTotalDeProducto(ventas, prod)
            };
            modeloTabla.addRow(obj);
        }

        jtProductos.setModel(modeloTabla);

        // Centra el texto en todas las celdas
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplica el render centrado a cada columna
        for (int i = 0; i < jtProductos.getColumnCount(); i++) {
            jtProductos.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }

}
