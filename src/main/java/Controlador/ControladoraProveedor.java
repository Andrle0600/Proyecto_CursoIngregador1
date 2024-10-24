package Controlador;

import DAO.ProveedorDAOImpl;
import Modelo.Proveedor;

public class ControladoraProveedor {
    private ProveedorDAOImpl proveedorDao;

    public ControladoraProveedor() {
        this.proveedorDao = new ProveedorDAOImpl(){};
    }

    public void crearProveedor(Proveedor prov) {
        proveedorDao.crear(prov);
    }

    public Proveedor leerProveedor(int id) {
        return proveedorDao.leer(id);
    }

    public void actualizarProveedor(Proveedor prov) {
        proveedorDao.actualizar(prov);
    }

    public void eliminarProveedor(int id) {
        proveedorDao.eliminar(id);
    }
    
    public Proveedor leerPorNombre(String nombre){
        return proveedorDao.leerPorNombre(nombre);
    }
}
