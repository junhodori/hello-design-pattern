package pattern.behavioral.interpreter;

public class Number implements Interpreter {
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpreter() {
        return n;
    }
}
