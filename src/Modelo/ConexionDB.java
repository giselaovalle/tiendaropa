
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @hp
 */
public class ConexionDB {
    public static Connection conexion;
    public Statement sentencia;


    
    private ConexionDB() {
     
          try {
        String driverDB = "com.mysql.jdbc.Driver";
        String urlDB= "jdbc:mysql://localhost:3306/tiendaropa";
        String userDB="root";
        String claveDB="";
            Class.forName(driverDB);
            conexion=(Connection) DriverManager.getConnection(urlDB, userDB,claveDB);
            sentencia = conexion.createStatement();
            JOptionPane.showMessageDialog(null, "Bienvenido a Tienda De Ropa");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "no encuentro el  driver");
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "NO puedo conectarme");
            
        
        }
    }
    
    
    public static void desconectar()
    {
        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "La conexion ha Finalizado");
        } catch (SQLException ex) {
            System.err.println("ha ocurrido un error y no se ha desconectado"+ex.getMessage());
        }
    }
    
  
public static ConexionDB getInstance(){
    return ConexionDBHolder.INSTANCE;
}
   private static class ConexionDBHolder{
       private static final ConexionDB INSTANCE=new ConexionDB();
   }
}
