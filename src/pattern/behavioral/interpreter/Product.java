package pattern.behavioral.interpreter;

public class Product implements Interpreter {
    private final Interpreter leftInterpreter;
    private final Interpreter rightInterpreter;

    public Product(Interpreter leftInterpreter, Interpreter rightInterpreter) {
        this.leftInterpreter = leftInterpreter;
        this.rightInterpreter = rightInterpreter;
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() * rightInterpreter.interpreter();
    }
}
