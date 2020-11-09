package SortingStrategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ReverseSortingTest {

    @Test
    public void AlphabeticalSortingTest() {
        List<String> list = Arrays.asList("Finn", "Marcy", "Jake", "Bonnie", "Simon");
        SortingStrategy sortingStrategy = new ReverseSorting(new AlphabeticalSorting());

        List<String> sortedList = sortingStrategy.sort(list);

        List<String> alphabeticallySortedList = Arrays.asList("Simon", "Marcy", "Jake", "Finn", "Bonnie");
        Assertions.assertEquals(alphabeticallySortedList, sortedList);
    }

}