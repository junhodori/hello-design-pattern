package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.FactoryMethod;

public class AbstractFactoryMethod {
    public static AbstractFactory getFactory(boolean smallcase) {
        if (smallcase) {
            return new SmallFactoryMethod();
        } else {
            return new FactoryMethod();
        }

    }
}
