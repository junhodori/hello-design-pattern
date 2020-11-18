package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.Alphabet;

public interface AbstractFactory {
    public Alphabet create(String name);
}
