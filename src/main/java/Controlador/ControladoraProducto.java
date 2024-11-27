package Controlador;

import DAO.ProductoDAO;
import DAO.ProductoDAOImpl;
import Modelo.Producto;
import java.util.List;

public class ControladoraProducto {
    private ProductoDAO productoDao;
    
    public ControladoraProducto(){
        this.productoDao=new ProductoDAOImpl(){};
    }
    
    public void crearProducto(Producto producto){
        productoDao.crear(producto);
    }
    
    public Producto leerProducto(int id){
        return productoDao.leer(id);
    }
    
    public void actualizarProducto(Producto producto){
        productoDao.actualizar(producto);
    }
    
    public void eliminarProducto(int id){
        productoDao.eliminar(id);
    }
    
    public List<Producto> leerTodo(){
        return productoDao.leerTodo();
    }
    
    public Producto leerPorNombre(String nombre){
        return productoDao.leerPorNombre(nombre);
    }
}