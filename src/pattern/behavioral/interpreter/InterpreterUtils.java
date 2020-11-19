package pattern.behavioral.interpreter;

public class InterpreterUtils {
    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    public static Interpreter getOperator(String s, Interpreter leftInterpreter, Interpreter rightInterpreter) {
        switch (s) {
            case "+":
                return new Add(leftInterpreter, rightInterpreter);
            case "-":
                return new Subtract(leftInterpreter, rightInterpreter);
            case "*":
                return new Product(leftInterpreter, rightInterpreter);
        }
        return null;
    }
}
