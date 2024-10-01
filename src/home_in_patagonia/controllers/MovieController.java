package home_in_patagonia.controllers;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
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

            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    Integer idMovie = resultSet.getInt("id");
                    String titulo = resultSet.getString("titulo");
                    String director = resultSet.getString("director");
                    Integer año = resultSet.getInt("año");
                    Integer duracion = resultSet.getInt("duracion");
                    String genero = resultSet.getString("genero");

                    Movie movie = new Movie(idMovie, titulo, director, año, duracion, genero);
                    listaMovies.add(movie);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se pudo conectar a la tabla movies " + e.getMessage());
        }
        return listaMovies;
    }
//Agregar peliculas

    public void agregarObjetoPeliculla(Movie movie) throws SQLException {
        listaMovies.add(movie);
        agregarPelicula(movie);
    }

    public void agregarPelicula(Movie movie) throws SQLException {
        String sql = "insert into movie(titulo, director, año, duracion, genero) values (?, ?, ?, ? ,?)";
        Connection connection = databaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try {
            statement.setString(1, movie.getTitulo());
            statement.setString(2, movie.getDirector());
            statement.setInt(3, movie.getAño());
            statement.setInt(4, movie.getDuracion());
            statement.setString(5, movie.getGenero());
            statement.executeUpdate();
            System.out.println("Pelicula agregada con exito");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al registrar la pelicula en base de datos" + e.getMessage());
        }
    }

    //Eliminar peliculas
    public Movie buscarPeliculaPorId(int idPelicula) {
    String sql = "select * from movie where id = ?";
    try (Connection connection = databaseConnection.getConnection()) {
        if (connection == null || connection.isClosed()) {
            System.out.println("La conexión no está habilitada o es nula");
            return null;
        }

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idPelicula);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id"); // Guardar el ID también
                String titulo = resultSet.getString("titulo");
                String director = resultSet.getString("director");
                Integer año = resultSet.getInt("año");
                Integer duracion = resultSet.getInt("duracion");
                String genero = resultSet.getString("genero");

                return new Movie(id, titulo, director, año, duracion, genero); // Incluye el ID en el constructor
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta" + e.getMessage());
        }
    } catch (SQLException e) {
        System.out.println("Error al establecer conexión a la base de datos" + e.getMessage());
    }
    return null;
}


    public boolean eliminarMovie(int idMovie) throws SQLException {
        String sql = "delete from movie where id = ?";
        Connection connection = databaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try {
            statement.setInt(1, idMovie);
            statement.executeUpdate();
            System.out.println("Pelicula eliminada con exito");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener la pelicula por id" + e.getMessage());
        }
        return false;
    }

    //Metodos de busqueda de pelicula y actualizar
    public Movie buscarPeliculaTitulo(String titulo) {
        String sql = "select * from movie where titulo = ?";

        try (Connection connection = databaseConnection.getConnection()) {
            if (connection == null || connection.isClosed()) {
                System.out.println("La conexccion no esta habilitada o es nula");
                return null;
            }
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, titulo);

                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    Integer idPelicula = resultSet.getInt("id");
                    titulo = resultSet.getString("titulo");
                    String director = resultSet.getString("director");
                    Integer año = resultSet.getInt("año");
                    Integer duracion = resultSet.getInt("duracion");
                    String genero = resultSet.getString("genero");

                    return new Movie(idPelicula, titulo, director, año, duracion, genero);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error l ejecutar la consulta" + e.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se ah podido conectar con la base de datos" + e.getMessage());
        }
        return null;
    }

    public boolean actualizarPelicula(int id, String titulo, String director, Integer año, Integer duracion, String genero) {
    DatabaseConnection databaseConnection = new DatabaseConnection();
    String sql = "UPDATE movie SET titulo = ?, director = ?, año = ?, duracion = ?, genero = ? WHERE id = ?";

    try (Connection connection = databaseConnection.getConnection(); 
         PreparedStatement statement = connection.prepareStatement(sql)) {
        // Asignar los valores a la sentencia SQL
        statement.setString(1, titulo);
        statement.setString(2, director);
        statement.setInt(3, año);
        statement.setInt(4, duracion);
        statement.setString(5, genero);
        statement.setInt(6, id);  // Asignar el id aquí

        // Ejecutar la sentencia de actualización
        int filasActualizadas = statement.executeUpdate();

        // Verificar si alguna fila fue actualizada
        if (filasActualizadas > 0) {
            System.out.println("Película actualizada en la base de datos con éxito.");
            return true;
        } else {
            System.out.println("No se encontró la película con el id especificado.");
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al actualizar la película: " + e.getMessage());
        return false;
    }
}

}
