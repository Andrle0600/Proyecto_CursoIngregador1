package Controlador;

import DAO.DetallePedidoDAO;
import DAO.DetallePedidoDAOImpl;
import Modelo.DetallePedido;
import Modelo.Pedido;
import java.util.List;

public class ControladoraDetallePedido {
    private DetallePedidoDAO detalleDao;
    
    public ControladoraDetallePedido(){
        this.detalleDao=new DetallePedidoDAOImpl(){};
    }
    
    public void crearDetallePedido(DetallePedido detalle){
        detalleDao.crear(detalle);
    }
    
    public DetallePedido leerDetallePedido(int id){
        return detalleDao.leer(id);
    }
    
    public void actualizarDetallePedido(DetallePedido detalle){
        detalleDao.actualizar(detalle);
    }
    
    public void eliminarDetallePedido(int id){
        detalleDao.eliminar(id);
    }
    
    public List<DetallePedido> leerTodo(){
        return detalleDao.leerTodo();
    }
    
    public List<DetallePedido> leerPorPedido(Pedido pedido){
        return detalleDao.leerPorPedido(pedido);
    }
}
