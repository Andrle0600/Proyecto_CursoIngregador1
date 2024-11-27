package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.DetalleVenta;
import Modelo.Venta;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleVentaDAOImpl implements DetalleVentaDAO{
    private DetalleVentaJpaController detallejpa;

    public DetalleVentaDAOImpl() {
        this.detallejpa=new DetalleVentaJpaController();
    }
       
    @Override
    public void crear(DetalleVenta detalle) {
        detallejpa.create(detalle);
    }

    @Override
    public DetalleVenta leer(int id) {
        return detallejpa.findDetalleVenta(id);
    }

    @Override
    public void actualizar(DetalleVenta detalle) {
        try {
            detallejpa.edit(detalle);
        } catch (Exception ex) {
            Logger.getLogger(DetalleVentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            detallejpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(DetalleVentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DetalleVenta> leerTodo() {
        return detallejpa.findDetalleVentaEntities();
    }

    @Override
    public List<DetalleVenta> leerPorPedido(Venta venta) {
        return detallejpa.findDetallesByPedidoId(venta);
    }
    
}
