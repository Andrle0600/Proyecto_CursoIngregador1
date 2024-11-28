package Controlador;

public class ControladoraGeneral {

    private ControladoraProveedor controlProveedor;
    private ControladoraPedido controlPedido;
    private ControladoraProducto controlProducto;
    private ControladoraDetallePedido controlDetallePedido;
    private ControladoraStock controlStock;
    private ControladoraVenta controlVenta;
    private ControladoraDetalleVenta controlDetalleVenta;

    public ControladoraGeneral() {
        this.controlProveedor = new ControladoraProveedor();
        this.controlPedido = new ControladoraPedido();
        this.controlProducto = new ControladoraProducto();
        this.controlDetallePedido = new ControladoraDetallePedido();
        this.controlStock = new ControladoraStock();
        this.controlVenta = new ControladoraVenta();
        this.controlDetalleVenta=new ControladoraDetalleVenta();
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

}
