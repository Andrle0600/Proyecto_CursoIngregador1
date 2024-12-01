package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection getConexion() throws SQLException {
        String url = "jdbc:mysql://u44okiaiwbjavwj7:xXaZu81WKNomZyX6pKOo@b9cbymoe3xtutiwj1wwj-mysql.services.clever-cloud.com:3306/b9cbymoe3xtutiwj1wwj";
        String usuario = "u44okiaiwbjavwj7";
        String contraseña = "xXaZu81WKNomZyX6pKOo";
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
