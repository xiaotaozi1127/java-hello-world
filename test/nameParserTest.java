import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameParserTest {
    @Test
    void getName() {
        nameParser name = new nameParser();
        assertEquals("taohui", name.getName());
    }

}