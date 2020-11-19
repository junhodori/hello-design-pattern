package pattern.behavioral.visitor;

public interface Visitor {
    void visit(Bus bus);

    void visit(Truck truck);
}
