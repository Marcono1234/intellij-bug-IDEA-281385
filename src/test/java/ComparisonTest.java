import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {
    @Test
    public void test() {
        assertEquals("1\n2", "1\\n2");
    }
}
