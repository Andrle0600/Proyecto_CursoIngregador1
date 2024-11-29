package Controlador;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImpl;
import Modelo.Categoria;
import java.util.List;

public class ControladoraCategoria {   
    private CategoriaDAO categoriaDao;
    
    public ControladoraCategoria(){
        this.categoriaDao=new CategoriaDAOImpl(){};
    }
    
    public void crearCategoria(Categoria categoria){
        categoriaDao.crear(categoria);
    }
    
    public Categoria leerDetallePedido(int id){
        return categoriaDao.leer(id);
    }
    
    public void actualizarDetallePedido(Categoria categoria){
        categoriaDao.actualizar(categoria);
    }
    
    public void eliminarDetallePedido(int id){
        categoriaDao.eliminar(id);
    }
    
    public List<Categoria> leerTodo(){
        return categoriaDao.leerTodo();
    }
}
