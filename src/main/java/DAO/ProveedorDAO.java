package DAO;

import Modelo.Proveedor;

public interface ProveedorDAO {
    void crear(Proveedor prov);

    Proveedor leer(int id);

    void actualizar(Proveedor prov);

    void eliminar(int id);
    
    Proveedor leerPorNombre(String nombre);
}
