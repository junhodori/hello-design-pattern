package pattern.behavioral.visitor;

public class Bus implements Car {
    private int fuel;

    Bus(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        System.out.println("버스 운행");
        --fuel;
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
