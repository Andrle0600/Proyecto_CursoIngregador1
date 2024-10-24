package Controlador;

public class ControladoraGeneral {

    private ControladoraProveedor controlProveedor;

    public ControladoraGeneral() {
        this.controlProveedor = new ControladoraProveedor();
    }

    // Métodos para obtener las controladoras específicas
    public ControladoraProveedor getControladoraProveedor() {
        return controlProveedor;
    }
}
