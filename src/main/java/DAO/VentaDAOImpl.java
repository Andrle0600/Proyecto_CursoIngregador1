package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Venta;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentaDAOImpl implements VentaDAO {

    private VentaJpaController ventajpa;

    public VentaDAOImpl() {
        this.ventajpa = new VentaJpaController();
    }

    @Override
    public void crear(Venta venta) {
        ventajpa.create(venta);
    }

    @Override
    public Venta leer(int id) {
        return ventajpa.findVenta(id);
    }

    @Override
    public void actualizar(Venta venta) {
        try {
            ventajpa.edit(venta);
        } catch (Exception ex) {
            Logger.getLogger(VentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            ventajpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(VentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Venta> leerTodo() {
        return ventajpa.findVentaEntities();
    }

    @Override
    public List<Venta> leerPorFechas(Date inicio, Date fin) {
        return ventajpa.findVentasByDateRange(inicio, fin);
    }

}
