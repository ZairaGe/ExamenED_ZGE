package biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de una Biblioteca con una serie de libors
 * Permite agregar, eliminar y encontrar libros por titulo y por autor
 *
 * @see Libro
 * @author Zaira Gonzalez Encabo
 * @version 4.3.2025
 */

public class Biblioteca {
    // TODO: Documentar estos atributos

    /** Lista de Libros que hay en la biblioteca*/
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de biblioteca SIN libros*/
    public Biblioteca() {
        libros = new ArrayList<>();
    }
    // TODO: Documentar este método.
// Test: NO HAY QUE TESTEAR ESTE METODO
    /** Constructor con parámetros
     *
     * @param libros Lista de libros con la que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    // TODO: Testear este metodo.
// Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
    // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }
    // TODO: Documentar este método

    /**
     *
     * @return
     */
    public List<Libro> getLibros() {
        return libros;
    }
    // TODO: Documentar este método.
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Devuelve un Libro por su titulo si existe o no
     * @param titulo
     * @return
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo.
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated Este metodo esta obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor
     * @return
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca los libros de un autor determinado
     * @since v2.0
     * Sustituye al metodo {@link #encuentaLibroPorAutor(String)}
     * @param autor
     * @return
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
