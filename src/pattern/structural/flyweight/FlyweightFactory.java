package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, ConcreteFlyweight> flyweightMap = new HashMap<>();

    public static Flyweight getFlyweight(String color) {
        ConcreteFlyweight concreteFlyweight = flyweightMap.get(color);

        if (concreteFlyweight == null) {
            concreteFlyweight = new ConcreteFlyweight(color);
            flyweightMap.put(color, concreteFlyweight);
            System.out.println("팩토리 신규생성 (" + color + ")");
        }

        return concreteFlyweight;
    }

}
