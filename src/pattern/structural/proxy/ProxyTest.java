package pattern.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        /**
         * Result-1은 실제 객체를 바로 호출해서 처리한다
         */
        Subject subject = new RealSubject();
        System.out.println("Result-1: " + subject.go());

        /**
         * 하지만 Result-2는 프록시 객체를 통해서 실제 객체를 호출한다
         * 결과는 동일하다
         */
        subject = new Proxy();
        System.out.println("Result-2: " + subject.go());
    }
}
