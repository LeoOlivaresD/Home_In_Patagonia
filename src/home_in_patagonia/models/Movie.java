
package home_in_patagonia.models;


public class Movie {
   Integer idMovie, año, duracion;
   String titulo, director, genero;

    public Movie() {
    }

    public Movie(Integer idMovie, String titulo, String director, Integer año, Integer duracion, String genero) {
        this.idMovie = idMovie;
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
    }

    public Movie(String titulo, String director, Integer año, Integer duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    
    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Movie{" + "idMovie=" + idMovie + ", titulo=" + titulo + ", director=" + director + ", a\u00f1o=" + año + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
   
   
   
}
