
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Moises
 */
//El patron utilizado es el sigleton
//Clase conexion para la BD
public class MyConexion {
    //Variables para la conexion
    static String url = "jdbc:mysql://localhost:3306/login";
    static String usuario = "root";
    static String pass="";
    
    
    //Conexion con la BD
    public static Connection Conectar(){
    
    Connection con = null;
    try{
        con = DriverManager.getConnection(url,usuario,pass);
        System.out.println("Conexion Exitosa");
        
    
    }catch(SQLException e)
    {
      e.printStackTrace();
    }
      return con;
    }
    
}


