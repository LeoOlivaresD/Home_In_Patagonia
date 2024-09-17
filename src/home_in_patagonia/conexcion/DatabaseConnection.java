package home_in_patagonia.conexcion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection obtenerConexion() {
        Connection connection = null;
        try {
            System.out.println("Intentado conectar a la base de datos..");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root", "undertaker179" );
            System.out.println("Conexcion exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return connection;
    }
}
