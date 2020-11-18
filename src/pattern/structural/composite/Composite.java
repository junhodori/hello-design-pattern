package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }
}
