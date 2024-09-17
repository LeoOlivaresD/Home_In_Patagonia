package home_in_patagonia;

import home_in_patagonia.conexcion.DatabaseConnection;


public class Home_In_Patagonia {

  
    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        
        connection.obtenerConexion();
                
    }
    
}
