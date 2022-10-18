package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        symbols = symbols.toLowerCase();
        word = word.toLowerCase();

        List<Character> symbolsList = new ArrayList<>();
        for (int i = 0; i < symbols.length(); i++){
            symbolsList.add(symbols.charAt(i));
        }

        List<Character> wordCharacterList = new ArrayList<>();
        for (int j = 0; j < word.length(); j++) {
            wordCharacterList.add(word.charAt(j));
        }

        if (symbolsList.size() < wordCharacterList.size()) {
            return false;
        }

        StringBuilder composedWord = new StringBuilder();
        for (Character wordChar: wordCharacterList) {
            if (symbolsList.contains(wordChar)) {
                composedWord.append(wordChar);
                symbolsList.remove(wordChar);
            }
        }
        return composedWord.toString().equals(word);
    }
}
//END
