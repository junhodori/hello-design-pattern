package pattern.behavioral.visitor;

public class Truck implements Car {
    private int fuel;

    Truck(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        System.out.println("트럭 운행");
        fuel -= 2;
    }

    @Override
    public void addFuel(int fuel) {
        this.fuel += fuel;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
