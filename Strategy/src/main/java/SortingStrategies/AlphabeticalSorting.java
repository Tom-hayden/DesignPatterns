package SortingStrategies;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalSorting implements SortingStrategy {

    public List<String> sort(List<String> list) {
        return list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
