package Controlador;

import DAO.PedidoDAO;
import DAO.PedidoDAOImpl;
import Modelo.Pedido;
import java.util.List;

public class ControladoraPedido {
    private PedidoDAO pedidoDao;
    
     public ControladoraPedido() {
        this.pedidoDao = new PedidoDAOImpl(){};
    }
    
    public void crearPedido (Pedido pedido){
        pedidoDao.crear(pedido);
    }
    
    public Pedido leerPedido (int id){
        return pedidoDao.leer(id);
    }
    
    public void actualizarPedido (Pedido pedido){
        pedidoDao.actualizar(pedido);
    }
    
    public void eliminarPedido(int id){
        pedidoDao.eliminar(id);
    }
    
    public List<Pedido> leerTodo(){
        return pedidoDao.leerTodo();
    }
     
}
