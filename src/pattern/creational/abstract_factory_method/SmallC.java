package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.Alphabet;

public class SmallC implements Alphabet {
    @Override
    public String name() {
        return "c";
    }
}
