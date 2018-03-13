import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class extendCustomMathTest {
    extendCustomMath math;
    @BeforeEach
    void setUp() {
        math = new extendCustomMath();
    }

    @Test
    void substract() {
        int result = math.substract(4, 1);
        assertEquals(3, result);
    }

    @Test
    void add() {
        int result = math.add(4, 1);
        assertEquals(5, result);
    }

    @Test
    void divide() {
        float result = math.divide(4, 2);
        assertEquals(2, result);
    }

}