package SortingStrategies;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSorting implements SortingStrategy{

    SortingStrategy strategyToReverse;

    public ReverseSorting(SortingStrategy sortingStrategy) {
        strategyToReverse = sortingStrategy;
    }

    @Override
    public List<String> sort(List<String> list) {
        return strategyToReverse.sort(list).stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
