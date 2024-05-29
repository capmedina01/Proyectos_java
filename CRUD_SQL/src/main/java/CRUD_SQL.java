
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author kalic
 */
public class CRUD_SQL {

    public static void main(String[] args) {
        ConexionSQL connection = new ConexionSQL();
        Connection conexion = connection.obtenerConexion();
    }
}
