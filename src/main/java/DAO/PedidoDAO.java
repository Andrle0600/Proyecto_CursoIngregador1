package DAO;

import Modelo.Pedido;
import java.util.List;

public interface PedidoDAO {
    void crear(Pedido pedido);
    
    Pedido leer(int id);

    void actualizar(Pedido pedido);

    void eliminar(int id);
    
    List<Pedido> leerTodo();
}
