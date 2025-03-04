package biblioteca;

/**
 * Clase con atributos que representan los libros de la biblioteca
 *
 * @see Biblioteca
 * @author Zaira Gonzalez Encabo
 * @version 4.3.2025
 */

public class Libro {
    // TODO: Documentar estos atributos
    /**
     * Atributos que forman la clase libro: titulo, autor, anioPublicacion
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;
    // TODO: Documentar este método
// TODO: Testear este método

    /**
     * Constructor con parámetros
     *
     * @param titulo titulo de los libros
     * @param autor autores de los libros
     * @param anioPublicacion año de la publicacion de los libros
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // TODO: Documentar este método

    /**
     * Obtiene el autor del libro
     * @return nombre del autor
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // TODO: Documentar este método

    /**
     * Obtiene el año de la publicacion del libro
     * @return año de publicación
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}

