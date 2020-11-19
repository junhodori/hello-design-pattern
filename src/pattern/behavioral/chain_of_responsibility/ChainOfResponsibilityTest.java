package pattern.behavioral.chain_of_responsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        /**
         * First 객체에서 요청을 처리하지 못할 경우 Second 객체로 넘기고 여기서도 처리 못하면 Third 객체로 넘긴다
         * "F"의 경우 3개의 객체에서 모두 처리 못하므로 Fail 이 표시된다
         */
        ChainOfResponsibility chainOfResponsibility = new First(new Second(new Third()));

        if (!chainOfResponsibility.process("A")) System.out.println("Fail");
        if (!chainOfResponsibility.process("B")) System.out.println("Fail");

        if (!chainOfResponsibility.process("C")) System.out.println("Fail");
        if (!chainOfResponsibility.process("D")) System.out.println("Fail");

        if (!chainOfResponsibility.process("E")) System.out.println("Fail");
        if (!chainOfResponsibility.process("F")) System.out.println("Fail");
    }
}
