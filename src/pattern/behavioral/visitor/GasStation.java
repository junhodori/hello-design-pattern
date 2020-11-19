package pattern.behavioral.visitor;

public class GasStation implements Visitor {
    int fuel;

    public GasStation(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void visit(Bus bus) {
        bus.addFuel(fuel);
    }

    @Override
    public void visit(Truck truck) {
        truck.addFuel(fuel + 5);
    }
}
