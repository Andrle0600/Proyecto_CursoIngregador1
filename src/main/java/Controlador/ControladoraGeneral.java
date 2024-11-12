package Controlador;

public class ControladoraGeneral {

    private ControladoraProveedor controlProveedor;
    private ControladoraPedido controlPedido;
    private ControladoraProducto controlProducto;
    private ControladoraDetallePedido controlDetalle;

    public ControladoraGeneral() {
        this.controlProveedor = new ControladoraProveedor();
        this.controlPedido = new ControladoraPedido();
        this.controlProducto = new ControladoraProducto();
        this.controlDetalle = new ControladoraDetallePedido();
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
    
    public ControladoraDetallePedido getControladoraDetallePedido(){
        return controlDetalle;
    }
}
