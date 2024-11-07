package Controlador;

public class ControladoraGeneral {

    private ControladoraProveedor controlProveedor;
    private ControladoraPedido controlPedido;

    public ControladoraGeneral() {
        this.controlProveedor = new ControladoraProveedor();
        this.controlPedido = new ControladoraPedido();
    }

    // Métodos para obtener las controladoras específicas
    public ControladoraProveedor getControladoraProveedor() {
        return controlProveedor;
    }
    
    public ControladoraPedido getControladoraPedido(){
        return controlPedido;
    }
}
