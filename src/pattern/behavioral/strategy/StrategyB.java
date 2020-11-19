package pattern.behavioral.strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyB implements Strategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
        return list;
    }
}
