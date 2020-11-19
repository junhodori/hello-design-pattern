package pattern.behavioral.strategy;

import java.util.List;

public class Context {
    Strategy strategy;
    List<Integer> list;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public void sort() {
        list = strategy.sort(list);
    }
}
