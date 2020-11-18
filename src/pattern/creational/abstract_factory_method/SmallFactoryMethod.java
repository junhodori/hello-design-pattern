package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.Alphabet;

public class SmallFactoryMethod implements AbstractFactory {
    @Override
    public Alphabet create(String name) {
        if (name.equals("A")) {
            return new SmallA();
        } else if (name.equals("B")) {
            return new SmallB();
        } else if (name.equals("C")) {
            return new SmallC();
        } else {
            return null;
        }
    }
}
