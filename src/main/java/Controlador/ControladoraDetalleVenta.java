package Controlador;

import DAO.DetalleVentaDAO;
import DAO.DetalleVentaDAOImpl;
import Modelo.DetalleVenta;
import Modelo.Venta;
import java.util.List;

public class ControladoraDetalleVenta {

    private DetalleVentaDAO detalleDao;

    public ControladoraDetalleVenta() {
        this.detalleDao = new DetalleVentaDAOImpl() {
        };
    }

    public void crearDetalleVenta(DetalleVenta detalle) {
        detalleDao.crear(detalle);
    }

    public DetalleVenta leerDetalleVenta(int id) {
        return detalleDao.leer(id);
    }

    public void actualizarDetalleVenta(DetalleVenta detalle) {
        detalleDao.actualizar(detalle);
    }

    public void eliminarDetalleVenta(int id) {
        detalleDao.eliminar(id);
    }

    public List<DetalleVenta> leerTodo() {
        return detalleDao.leerTodo();
    }

    public List<DetalleVenta> leerPorVenta(Venta venta) {
        return detalleDao.leerPorPedido(venta);
    }

}
