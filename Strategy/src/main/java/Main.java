import SortingStrategies.AlphabeticalSorting;
import SortingStrategies.ReverseSorting;
import SortingStrategies.ScrabblePointsSorting;
import SortingStrategies.SortingStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] strings = new String[]{"a","b","c","d","e","z","a"};

        SortingStrategy sortingStrategy = new AlphabeticalSorting();
        System.out.println("Alphabetical sorting");
        System.out.println(sortingStrategy.sort(Arrays.asList(strings)));


        sortingStrategy = new ScrabblePointsSorting();
        System.out.println("Scrabble sorting");
        System.out.println(sortingStrategy.sort(Arrays.asList(strings)));


        sortingStrategy = new ReverseSorting(sortingStrategy);
        System.out.println("Reverse alphabetical sorting");
        System.out.println(sortingStrategy.sort(Arrays.asList(strings)));
    }

}