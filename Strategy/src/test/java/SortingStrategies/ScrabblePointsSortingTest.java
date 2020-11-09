package SortingStrategies;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabblePointsSortingTest {
    @Test
    public void ScrabbleSortingTest() {
        List<String> list = Arrays.asList("Finn", "Marcy", "Jake", "Bonnie", "Simon");
        SortingStrategy sortingStrategy = new ScrabblePointsSorting();
        List<String> sortedList = sortingStrategy.sort(list);
        List<String> scrabbleList = Arrays.asList("Jake", "Marcy", "Bonnie", "Finn", "Simon");
        Assertions.assertEquals(scrabbleList, sortedList);
    }

    @Test
    public void ScrabbleSortingTest_EqualPoints() {
        List<String> list = Arrays.asList("Simon", "Finn");
        SortingStrategy sortingStrategy = new ScrabblePointsSorting();
        List<String> sortedList = sortingStrategy.sort(list);
        List<String> scrabbleList = Arrays.asList("Finn", "Simon");
        Assertions.assertEquals(scrabbleList, sortedList);
    }

    @Test
    public void ScrabblePointsTest() {
        ScrabblePointsSorting scrabblePointsSorting = new ScrabblePointsSorting();
        Assertions.assertEquals(39, scrabblePointsSorting.getScrabblePoints("abcdefghijklmn"));
        Assertions.assertEquals(52, scrabblePointsSorting.getScrabblePoints("mnopqrstuvwxyz"));
    }
}
