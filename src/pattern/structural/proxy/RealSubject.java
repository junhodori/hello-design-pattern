package pattern.structural.proxy;

public class RealSubject implements Subject {
    @Override
    public String go() {
        return "go";
    }
}
