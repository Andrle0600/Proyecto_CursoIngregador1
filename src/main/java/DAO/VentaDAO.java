package DAO;

import Modelo.Venta;
import java.util.Date;
import java.util.List;

public interface VentaDAO {
    void crear(Venta venta);
    
    Venta leer(int id);

    void actualizar(Venta venta);

    void eliminar(int id);
    
    List<Venta> leerTodo();
    
    List<Venta> leerPorFechas(Date inicio, Date fin);
}
