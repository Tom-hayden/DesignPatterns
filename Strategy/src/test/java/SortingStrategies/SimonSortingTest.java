package SortingStrategies;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimonSortingTest {

    @Test
    public void SimonSortingTest() {
        List<String> list = Arrays.asList("Finn", "Marcy", "Jake", "Bonnie", "Simon");
        SortingStrategy sortingStrategy = new SimonSorting();
        List<String> sortedList = sortingStrategy.sort(list);
        List<String> simonList = Arrays.asList("Simon", "Simon", "Simon", "Simon", "Simon");
        Assertions.assertEquals(simonList, sortedList);
    }
}