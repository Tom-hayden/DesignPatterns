package SortingStrategies;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlphabeticalSortingTest {

    @Test
    public void AlphabeticalSortingTest() {
        List<String> list = Arrays.asList("Finn", "Marcy", "Jake", "Bonnie", "Simon");
        SortingStrategy sortingStrategy = new AlphabeticalSorting();
        List<String> sortedList = sortingStrategy.sort(list);
        List<String> alphabeticallySortedList = Arrays.asList("Bonnie", "Finn", "Jake", "Marcy", "Simon");
        Assertions.assertEquals(alphabeticallySortedList, sortedList);
    }
}