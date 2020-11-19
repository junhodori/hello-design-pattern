package pattern.structural.proxy;

public class Proxy implements Subject {
    Subject subject;

    @Override
    public String go() {
        System.out.println("프록시를 통하여 처리중...");
        subject = new RealSubject();
        return subject.go();
    }
}
