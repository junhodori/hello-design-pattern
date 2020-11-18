package pattern.creational.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // A,B,C 클래스가 변경되거나 삭제되면 클라이언트 코드에서도 문제가 발생한다
        Alphabet a = new A();
        Alphabet b = new B();
        Alphabet c = new C();

        System.out.println("new A() : " + a.name());
        System.out.println("new B() : " + b.name());
        System.out.println("new C() : " + c.name());

        // 팩토리 메소드 패턴을 사용해서 클라이언트 코드와 객체 생성 코드를 분리하여 의존성을 낮추었기 때문에
        // A,B,C 클래스가 변경되거나 삭제되어도 문제가 없다
        FactoryMethod factoryMethod = new FactoryMethod();
        Alphabet a1 = factoryMethod.create("A");
        Alphabet b1 = factoryMethod.create("B");
        Alphabet c1 = factoryMethod.create("C");

        System.out.println("factoryMethod.create(\"A\") : " + a1.name());
        System.out.println("factoryMethod.create(\"B\") : " + b1.name());
        System.out.println("factoryMethod.create(\"C\") : " + c1.name());
    }
}
