package home_in_patagonia.conexcion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    //variables de conexion
    private static final String URL ="jdbc:mysql://localhost:3306/moviesdb";
    private static final String USER = "root";
    private static final String PASSWORD ="undertaker179";
    
    private Connection connection;

    public DatabaseConnection() {
        obtenerConexion();
    }
    
    public void obtenerConexion() {
       try{
           connection = DriverManager.getConnection(URL, USER, PASSWORD);
           System.out.println("Conexion establecida com exito");
       }catch(SQLException e){
       e.printStackTrace();
           System.out.println("No pudimos conectar a la base de datos" + e.getMessage());
       }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
        if(connection != null);
        try{
        connection.close();
            System.out.println("Conexion cerrada con exito");
        }catch(SQLException e){
        e.printStackTrace();
            System.out.println("No se ha podido cerrar la conexion" + e.getMessage());
        }
    
    }
}
