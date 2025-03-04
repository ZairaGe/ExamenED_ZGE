package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("Orgullo y Prejuicio", "Jane Austen", 1813);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
        assertFalse(biblioteca.eliminarLibro(this.libro));
    }

    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(this.libro);

        assertNotNull(biblioteca.getLibros());

        assertEquals(biblioteca.getLibros().size(), 1);

        assertTrue(biblioteca.getLibros().contains(this.libro));
    }
}