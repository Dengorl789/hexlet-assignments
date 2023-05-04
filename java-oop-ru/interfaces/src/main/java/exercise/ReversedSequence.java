package exercise;

import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence{
    private String str;
    @Override
    public int length() {
        return str.length();
    }
    @Override
    public char charAt(int i) {
        return str.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return str.subSequence(i, i1);
    }

    @Override
    public String toString() {
        return  str;
    }
    public ReversedSequence(String str) {
        String result = "";
        for(int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        if (str.equals("")){
            result = "";
        }
        this.str = result;
    }
}
// END
