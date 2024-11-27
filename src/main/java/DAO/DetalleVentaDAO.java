package DAO;

import Modelo.DetalleVenta;
import Modelo.Venta;
import java.util.List;

public interface DetalleVentaDAO {
    void crear(DetalleVenta detalle);
    
    DetalleVenta leer(int id);

    void actualizar(DetalleVenta detalle);

    void eliminar(int id);
    
    List<DetalleVenta> leerTodo();
    
    List<DetalleVenta> leerPorPedido(Venta venta);
}
