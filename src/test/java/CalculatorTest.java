import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void add() {
        assertEquals(7,c.add(5,2));
    }

    @Test
    void subtract() {
        assertEquals(3,c.subtract(5,2));
        assertEquals(2,c.subtract(6,4));
        assertEquals(1,c.subtract(6,5));
        assertEquals(1,c.subtract(7,6));
        assertEquals(1,c.subtract(8,7));
    }

    @Test
    void main() {
    }
}