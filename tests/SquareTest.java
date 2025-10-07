import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testIsSquare_withPerfectSquare() {
        assertTrue(Square.isSquare(81));
    }

    @Test
    void testIsSquare_withNonSquareNumber() {
        assertFalse(Square.isSquare(80));
    }

    @Test
    void testIsSquare_withZero() {
        assertTrue(Square.isSquare(0));
    }

    @Test
    void testIsSquare_withNegativeNumber() {
        assertFalse(Square.isSquare(-1));
    }

    @Test
    void testIsSquare_withOne() {
        assertTrue(Square.isSquare(1));
    }
}