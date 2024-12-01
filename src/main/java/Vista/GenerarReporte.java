package Vista;

import Controlador.ControladoraGeneral;
import Modelo.Producto;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerarReporte extends javax.swing.JFrame {

    ControladoraGeneral control;
    List<Producto> productos;
    String[] titulos = {"Producto", "Cantidad", "Precio de Compra", "Precio de Venta", "Categoria", "Proveedor"};

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
        btnDescargar = new javax.swing.JButton();
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

        btnDescargar.setBackground(new java.awt.Color(200, 76, 229));
        btnDescargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDescargar.setForeground(new java.awt.Color(0, 0, 0));
        btnDescargar.setText("Descargar Reporte");
        btnDescargar.setBorderPainted(false);
        btnDescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

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
                                .addComponent(btnDescargar)))))
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
                    .addComponent(btnDescargar))
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

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        crearExcel();
        String fecha = obtenerFecha();
        String nombreArchivo = "productos-hasta-" + fecha + ".xlsx";
        mostrarMensaje("Archivo generado en la carpeta \"Productos\" de su escritorio\nCon el nombre " + nombreArchivo, "informacion");
    }//GEN-LAST:event_btnDescargarActionPerformed

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

    private String obtenerFecha() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatear la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fechaActual.format(formatter);
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

    private void todoBordeDelgado(XSSFCellStyle estilo) {
        estilo.setBorderBottom(BorderStyle.THIN);
        estilo.setBorderTop(BorderStyle.THIN);
        estilo.setBorderRight(BorderStyle.THIN);
        estilo.setBorderLeft(BorderStyle.THIN);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
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

    private static final String COLOR_CABECERA = "LIGHT_GREEN";
    private static final String NOMBRE_HOJA = "Productos";

    private void crearExcel() {
        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja = libro.createSheet(NOMBRE_HOJA);

        // Estilo de cabecera y contenido
        XSSFCellStyle estiloCabecera = configurarEstilo(libro, true);
        XSSFCellStyle estiloContenido = configurarEstilo(libro, false);

        //Crea sección de Fecha
        Row filaFecha = hoja.createRow(0);
        filaFecha.createCell(0).setCellValue("Fecha");
        filaFecha.getCell(0).setCellStyle(estiloCabecera);

        filaFecha.createCell(1).setCellValue(obtenerFecha());
        filaFecha.getCell(1).setCellStyle(estiloContenido);

        // Crear cabecera
        crearCabecera(hoja, estiloCabecera);

        // Llenar datos
        llenarDatosProductos(hoja, estiloContenido);

        // Ajustar tamaño de columnas
        for (int i = 0; i < 7; i++) {
            hoja.autoSizeColumn(i);
        }

        // Guardar archivo en la carpeta productos del escritorio
        guardarArchivo(libro, generarNombreArchivo());
    }

    // Configura estilos reutilizables
    private XSSFCellStyle configurarEstilo(XSSFWorkbook libro, boolean cabecera) {
        XSSFCellStyle estilo = libro.createCellStyle();
        XSSFFont fuente = libro.createFont();

        if (cabecera) {
            estilo.setFillForegroundColor(IndexedColors.valueOf(COLOR_CABECERA).getIndex());
            estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            fuente.setBold(true);
        }

        estilo.setFont(fuente);
        estilo.setAlignment(HorizontalAlignment.CENTER);
        todoBordeDelgado(estilo);

        return estilo;
    }

    // Crea la cabecera de la hoja
    private void crearCabecera(XSSFSheet hoja, XSSFCellStyle estilo) {

        Row cabecera = hoja.createRow(2);
        int indice = 1;
        for (String titulo : titulos) {
            Cell celda = cabecera.createCell(indice++);
            celda.setCellValue(titulo);
            celda.setCellStyle(estilo);
        }
    }

    // Llena los datos de los productos
    private void llenarDatosProductos(XSSFSheet hoja, XSSFCellStyle estilo) {
        int filaInicio = 3;

        for (Producto prod : productos) {
            Row fila = hoja.createRow(filaInicio++);
            int columnaInicio = 1;

            fila.createCell(columnaInicio++).setCellValue(prod.getNombre());
            fila.createCell(columnaInicio++).setCellValue(prod.getStock().getCantidad());
            fila.createCell(columnaInicio++).setCellValue(formatoSoles(prod.getPrecioCompra(), false));
            fila.createCell(columnaInicio++).setCellValue(formatoSoles(calcularPrecioVenta(prod), true));
            fila.createCell(columnaInicio++).setCellValue(validarCategoria(prod));
            fila.createCell(columnaInicio++).setCellValue(validarProveedor(prod));

            for (int i = 1; i <= 6; i++) {
                fila.getCell(i).setCellStyle(estilo);
            }
        }
    }

    // Genera el nombre del archivo basado en la fecha
    private String generarNombreArchivo() {
        return "productos-hasta-" + obtenerFecha() + ".xlsx";
    }

    // Guarda el archivo en la carpeta productos del escritorio
    private void guardarArchivo(XSSFWorkbook libro, String nombreArchivo) {
        String rutaEscritorio = System.getProperty("user.home") + File.separator + "Desktop";
        String rutaCarpetaProductos = rutaEscritorio + File.separator + "productos";

        File carpetaProductos = new File(rutaCarpetaProductos);
        if (!carpetaProductos.exists()) {
            carpetaProductos.mkdirs();
        }

        String rutaCompleta = rutaCarpetaProductos + File.separator + nombreArchivo;

        try (OutputStream output = new FileOutputStream(rutaCompleta)) {
            libro.write(output);
            libro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
