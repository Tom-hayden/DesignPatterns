package SortingStrategies;

import java.util.ArrayList;
import java.util.List;

public class UnchangedSorting implements SortingStrategy {
    public List<String> sort(List<String> list) {
        return new ArrayList<>(list);
    }
}
