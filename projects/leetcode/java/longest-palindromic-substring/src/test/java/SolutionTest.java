import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void nullString() {
        String value = null;
        String result = solution.longestPalindrome(value);
        assertTrue(result == null);
    }

    @Test
    public void emptyString() {
        String value = "";
        String result = solution.longestPalindrome(value);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test1() {
        String value = "b";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("b"));
    }

    @Test
    public void test2() {
        String value = "bb";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bb"));
    }

    @Test
    public void test3() {
        String value = "bbb";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bbb"));
    }

    @Test
    public void test4() {
        String value = "bbbb";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bbbb"));
    }

    @Test
    public void test5() {
        String value = "bbab";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bab"));
    }

    @Test
    public void test6() {
        String value = "bbabb";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bbabb"));
    }

    @Test
    public void test7() {
        String value = "abababa";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("abababa"));
    }

    @Test
    public void test8() {
        String value = "abacdadcbcdefedcbxx";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bcdefedcb"));
    }

    @Test
    public void test9() {
        String value = "cbbd";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("bb"));
    }

    @Test
    public void test10() {
        String value = "bananas";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("anana"));
    }

    @Test
    public void test11() {
        String value = "ccd";
        String result = solution.longestPalindrome(value);
        assertTrue(result.equals("cc"));
    }
}