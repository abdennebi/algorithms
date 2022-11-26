import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void nullString() {
        String value = null;
        String result = solution.convert(value, 3);
        assertTrue(result == null);
    }

    @Test
    public void emptyString() {
        String value = "";
        String result = solution.convert(value, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test0() {
        String value = "abcd";
        String result = solution.convert(value, 0);
        assertTrue(result == null);
    }

    @Test
    public void test1() {
        String value = "PAYPALISHIRING";
        String result = solution.convert(value, 3);
        assertTrue(result.equals("PAHNAPLSIIGYIR"));
    }

}