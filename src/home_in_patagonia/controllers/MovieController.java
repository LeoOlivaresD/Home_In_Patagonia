package home_in_patagonia.controllers;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import home_in_patagonia.conexcion.DatabaseConnection;
import home_in_patagonia.models.Movie;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieController {

    private DatabaseConnection databaseConnection;
    private List<Movie> listaMovies;

    public MovieController() {
        databaseConnection = new DatabaseConnection();
        listaMovies = new ArrayList<>();
    }

    public MovieController(DatabaseConnection databaseConnection, List<Movie> listaMovies) {
        this.databaseConnection = databaseConnection;
        this.listaMovies = listaMovies;
    }

    //Listar peliculas
    public List<Movie> getMovieFromDB() {
        List<Movie> listaMovies = new ArrayList();
        String query = "select * from Movie";
        try {
            Connection connection = databaseConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
            Integer idMovie = resultSet.getInt("id");
            String titulo = resultSet.getString("titulo");
            String director = resultSet.getString("director");
            Integer año = resultSet.getInt("año");
            Integer duracion = resultSet.getInt("duracion");
            String genero = resultSet.getString("genero");
            
            Movie movie = new Movie(idMovie, titulo, director, año, duracion, genero);
            listaMovies.add(movie);
            
            }
        }catch(SQLException e){
        e.printStackTrace();
            System.out.println("No se pudo conectar a la tabla movies " + e.getMessage());
        }
        return listaMovies;
    }

}
