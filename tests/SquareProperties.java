import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SquareProperties {

    @Property
    void isSquareOfSquareShouldBeTrue(@ForAll int n) {
        long square = (long) n * n;
        if (square >= 0 && square <= Integer.MAX_VALUE) {
            assertTrue(Square.isSquare((int) square));
        }
    }

    @Property
    void isSquareForNegativeShouldBeFalse(@ForAll("negativeIntegers") int n) {
        assertFalse(Square.isSquare(n));
    }

    @Provide
    Arbitrary<Integer> negativeIntegers() {
        return Arbitraries.integers().filter(n -> n < 0);
    }
}