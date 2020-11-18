package pattern.creational.abstract_factory_method;

import pattern.creational.factory_method.Alphabet;

public class AbstractFactoryMethodTest {
    public static void main(String[] args) {
        // 팩토리의 상위 팩토리를 통해 구체적인 팩토리를 가져옴
        // SmallFactoryMethod 팩토리를 가져옴
        boolean smallcase = true;
        AbstractFactory abstractFactory = AbstractFactoryMethod.getFactory(smallcase);

        Alphabet a = abstractFactory.create("A");
        Alphabet b = abstractFactory.create("B");
        Alphabet c = abstractFactory.create("C");

        System.out.println("SmallFactoryMethod : " + a.name());
        System.out.println("SmallFactoryMethod : " + b.name());
        System.out.println("SmallFactoryMethod : " + c.name());

        // 팩토리의 상위 팩토리를 통해 구체적인 팩토리를 가져옴
        // FactoryMethod 팩토리를 가져옴
        smallcase = false;
        abstractFactory = AbstractFactoryMethod.getFactory(smallcase);

        Alphabet a1 = abstractFactory.create("A");
        Alphabet b1 = abstractFactory.create("B");
        Alphabet c1 = abstractFactory.create("C");

        System.out.println("FactoryMethod : " + a1.name());
        System.out.println("FactoryMethod : " + b1.name());
        System.out.println("FactoryMethod : " + c1.name());

    }
}
