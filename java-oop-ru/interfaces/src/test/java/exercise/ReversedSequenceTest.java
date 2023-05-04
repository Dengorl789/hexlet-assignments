package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedSequenceTest {
    @Test
    public void reversedSequenceClassTest1() {
        CharSequence text = new ReversedSequence("abcdef");
        char actual = text.charAt(0);
        char expected = 'f';
        assertEquals(expected, actual);
    }
    @Test
    public void reversedSequenceClassTest2() {
        CharSequence text = new ReversedSequence("abcdef");
        String actual = text.toString();
        String expected = "fedcba";
        assertEquals(expected, actual);
    }
    @Test
    public void reversedSequenceClassTest3() {
        CharSequence text = new ReversedSequence("abcdef");
        CharSequence  actual = text.subSequence(1,4);
        CharSequence expected = "edc";
        assertEquals(expected, actual);
    }
    @Test
    public void reversedSequenceClassTest4() {
        CharSequence text = new ReversedSequence("abcdef");
        int actual = text.length();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void reversedSequenceClassTest5() {
        CharSequence text = new ReversedSequence("");
        String actual = text.toString();
        String expected = "";
        assertEquals(expected, actual);
    }
}
