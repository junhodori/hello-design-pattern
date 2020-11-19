package pattern.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        /**
         * ChristmasTree : 크리스마스 트리 인터페이스
         * DefaultChristmasTree : 꾸며지지 않은 디폴트 크리스마스 트리
         * Decorator : 꾸며주는 데코레이터 클래스 (이것을 상속받은 Flowers 클래스와 Lights 클래스는 디폴트 크리스마스 트리를 꾸며줄 수 있다)
         *
         */
        ChristmasTree christmasTree = new DefaultChristmasTree();
        System.out.println(christmasTree.decorate());

        christmasTree = new Lights(new DefaultChristmasTree());
        System.out.println(christmasTree.decorate());

        christmasTree = new Flowers(new Lights(new DefaultChristmasTree()));
        System.out.println(christmasTree.decorate());


    }
}
