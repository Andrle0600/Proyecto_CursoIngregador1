package Controlador;

public class ControladoraGeneral {

    private final ControladoraProveedor controlProveedor;
    private final ControladoraPedido controlPedido;
    private final ControladoraProducto controlProducto;
    private final ControladoraDetallePedido controlDetallePedido;
    private final ControladoraStock controlStock;
    private final ControladoraVenta controlVenta;
    private final ControladoraDetalleVenta controlDetalleVenta;
    private final ControladoraCategoria controlCategoria;

    public ControladoraGeneral() {
        this.controlProveedor = new ControladoraProveedor();
        this.controlPedido = new ControladoraPedido();
        this.controlProducto = new ControladoraProducto();
        this.controlDetallePedido = new ControladoraDetallePedido();
        this.controlStock = new ControladoraStock();
        this.controlVenta = new ControladoraVenta();
        this.controlDetalleVenta=new ControladoraDetalleVenta();
        this.controlCategoria=new ControladoraCategoria();
    }

    // Métodos para obtener las controladoras específicas
    public ControladoraProveedor getControladoraProveedor() {
        return controlProveedor;
    }

    public ControladoraPedido getControladoraPedido() {
        return controlPedido;
    }

    public ControladoraProducto getControladoraProducto() {
        return controlProducto;
    }

    public ControladoraDetallePedido getControladoraDetallePedido() {
        return controlDetallePedido;
    }

    public ControladoraStock getControladoraStock() {
        return controlStock;
    }

    public ControladoraVenta getControladoraVenta() {
        return controlVenta;
    }
    
    public ControladoraDetalleVenta getControladoraDetalleVenta(){
        return controlDetalleVenta;
    }
    
    public ControladoraCategoria getControladoraCategoria(){
        return controlCategoria;
    }

}
