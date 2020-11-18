package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.Alphabet;

public class SmallB implements Alphabet {
    @Override
    public String name() {
        return "b";
    }
}
