package pattern.behavioral.interpreter;

public class Subtract implements Interpreter {
    private final Interpreter leftInterpreter;
    private final Interpreter rightInterpreter;

    public Subtract(Interpreter leftInterpreter, Interpreter rightInterpreter) {
        this.leftInterpreter = leftInterpreter;
        this.rightInterpreter = rightInterpreter;
    }

    @Override
    public int interpreter() {
        return leftInterpreter.interpreter() - rightInterpreter.interpreter();
    }
}
