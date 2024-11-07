package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.DetallePedido;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetallePedidoDAOImpl implements DetallePedidoDAO{
    
    private DetallePedidoJpaController detalleJpa;
    
    public DetallePedidoDAOImpl(){
        this.detalleJpa=new DetallePedidoJpaController();
    }
    
    @Override
    public void crear(DetallePedido detalle) {
        detalleJpa.create(detalle);
    }

    @Override
    public DetallePedido leer(int id) {
        return detalleJpa.findDetallePedido(id);
    }

    @Override
    public void actualizar(DetallePedido detalle) {
        try {
            detalleJpa.edit(detalle);
        } catch (Exception ex) {
            Logger.getLogger(DetallePedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            detalleJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(DetallePedidoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DetallePedido> leerTodo() {
        return detalleJpa.findDetallePedidoEntities();
    }
    
}
