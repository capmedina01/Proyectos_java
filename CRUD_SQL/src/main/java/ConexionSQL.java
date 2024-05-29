
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kalic
 */
public class ConexionSQL {
    
    Connection conexion = null;
    
    String usuario = "sa";
    String pswd = "masterkey";
    String db = "CRUD";
    String ip = "localhost";
    String puerto = "44308";
    
    public Connection obtenerConexion(){
        try{
            
            String connectionString = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db;
            
            conexion = DriverManager.getConnection(connectionString, usuario, pswd);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        
        
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error"+ e.toString());
            e.printStackTrace();    
        
        }
        
        
        return conexion;
    }
            
            
    
}
