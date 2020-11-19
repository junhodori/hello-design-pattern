package pattern.behavioral.visitor;

public interface Car {
    void drive();

    void addFuel(int fuel);

    int getFuel();

    void visit(Visitor visitor);
}
