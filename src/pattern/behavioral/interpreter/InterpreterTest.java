package pattern.behavioral.interpreter;

import java.util.Stack;

public class InterpreterTest {
    public static void main(String[] args) {
        /**
         * 인터프리터 패턴은 문법 규칙을 클래스화 한 구조로서,
         * 일련의 규칙으로 된 언어를 재귀적으로 분석하는 방식이다
         * 예) SQL 쿼리 언어 분석, 통신 프로토콜
         *
         * 순서대로 숫자를 스택에 넣고 연산자(+, -, *)가 나오면 스택 안의 숫자 2개를 꺼내서 해당 연산자로 계산한뒤 다시 스택에 넣는다
         * 이것을 반복해서 마지막이 되면 스택에 있는 숫자를 꺼내서 출력한다
         */
        String token = "7 3 - 2 1 + *";

        Stack<Interpreter> stack = new Stack<>();
        String[] tokenArray = token.split(" ");

        for (String s : tokenArray) {
            if (InterpreterUtils.isOperator(s)) {
                Interpreter rightInterpreter = stack.pop();
                Interpreter leftInterpreter = stack.pop();
                Interpreter operator = InterpreterUtils.getOperator(s, leftInterpreter, rightInterpreter);

                int result = operator.interpreter();
                stack.push(new Number(result));
            } else {
                Interpreter interpreter = new Number(Integer.parseInt(s));
                stack.push(interpreter);
            }
        }

        System.out.println("[원래 값] " + token);
        System.out.println("[분석 값] " + stack.pop().interpreter());
    }
}
