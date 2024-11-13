package DAO;

import Modelo.DetallePedido;
import Modelo.Pedido;
import java.util.List;

public interface DetallePedidoDAO {
    void crear(DetallePedido detalle);
    
    DetallePedido leer(int id);

    void actualizar(DetallePedido detalle);

    void eliminar(int id);
    
    List<DetallePedido> leerTodo();
    
    List<DetallePedido> leerPorPedido(Pedido pedido);
}
