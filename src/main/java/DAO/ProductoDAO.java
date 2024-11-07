package DAO;

import Modelo.Producto;
import java.util.List;

public interface ProductoDAO {
    void crear(Producto producto);
    
    Producto leer(int id);

    void actualizar(Producto producto);

    void eliminar(int id);
    
    List<Producto> leerTodo();
}
