package Controlador;

import DAO.VentaDAO;
import DAO.VentaDAOImpl;
import Modelo.Venta;
import java.util.List;

public class ControladoraVenta {
    private VentaDAO ventaDao;

    public ControladoraVenta() {
        this.ventaDao=new VentaDAOImpl(){};
    }
    
    public void crearVenta(Venta venta){
        ventaDao.crear(venta);
    }
    
    public Venta leerVenta(int id){
        return ventaDao.leer(id);
    }
    
    public void actualizarVenta(Venta venta){
        ventaDao.actualizar(venta);
    }
    
    public void eliminarVenta(int id){
        ventaDao.eliminar(id);
    }

    public List<Venta> leerTodo(){
        return ventaDao.leerTodo();
    }
    
}
