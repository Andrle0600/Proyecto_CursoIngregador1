package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection getConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bdesdiel";
        String usuario = "root";
        String contraseña = "";
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
