package SortingStrategies;

import java.util.List;
import java.util.stream.Collectors;

public class SimonSorting implements SortingStrategy {
    public SimonSorting() {
    }

    public List<String> sort(List<String> list) {
        return list.stream().map((name) -> "Simon").collect(Collectors.toList());
    }
}
