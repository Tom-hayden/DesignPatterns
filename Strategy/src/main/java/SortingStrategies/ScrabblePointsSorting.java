package SortingStrategies;

import java.util.List;
import java.util.stream.Collectors;
import javafx.util.Pair;

public class ScrabblePointsSorting implements SortingStrategy {
    public ScrabblePointsSorting() {
    }

    public List<String> sort(List<String> list) {
        return list.stream().map((string) -> {
            return new Pair<>(string, this.getScrabblePoints(string));
        }).sorted((pair1, pair2) -> {
            if (pair1.getValue() < pair2.getValue()) {
                return 1;
            } else {
                return (pair1.getValue()).equals(pair2.getValue())
                        ? (pair1.getKey()).compareTo(pair2.getKey())
                        : -1;
            }
        }).map(Pair::getKey).collect(Collectors.toList());
    }

    public int getScrabblePoints(String string) {
        int score = 0;
        for (char letter : string.toLowerCase().toCharArray()){
            score += this.getLetterScore(letter);
        }
        return score;
    }

    private int getLetterScore(char letter) {
        switch(letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'l':
            case 'n':
            case 'o':
            case 'r':
            case 's':
            case 't':
            case 'u':
                return 1;
            case 'b':
            case 'c':
            case 'm':
            case 'p':
                return 3;
            case 'd':
            case 'g':
                return 2;
            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y':
                return 4;
            case 'j':
            case 'x':
                return 8;
            case 'k':
                return 5;
            case 'q':
            case 'z':
                return 10;
            default:
                throw new RuntimeException("Unexpected character " + letter + ".");
        }
    }
}