package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Orgullo y Prejuicio", "Jane Austen", 1813);
    }
}