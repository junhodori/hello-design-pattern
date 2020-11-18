package pattern.creational.factory_method;

import pattern.creational.abstract_factory_method.AbstractFactory;

public class FactoryMethod implements AbstractFactory {
    public Alphabet create(String name) {
        if (name.equals("A")) {
            return new A();
        } else if (name.equals("B")) {
            return new B();
        } else if (name.equals("C")) {
            return new C();
        } else {
            return null;
        }
    }
}
