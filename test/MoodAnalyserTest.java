import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    void testMoodAnalyser() {
        customeMath math = new customeMath();
        int result = math.add(1, 2);
        assertEquals(3, result);
    }
}
