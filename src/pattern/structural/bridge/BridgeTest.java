package pattern.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        // PersonA 는 천천히 걷는다
        BridgeHandler bridgeHandler1 = new PersonA("A");
        bridgeHandler1.walking();

        // PersonB 는 빨리 걷는다
        BridgeHandler bridgeHandler2 = new PersonB("B");
        bridgeHandler2.walking();

        /**
         * Bridge 추상 클래스는 기능에 대한 부분을 담당하고
         * BridgeHandler 인터페이스는 구현 부분을 담당한다
         * 이렇게 기능과 구현을 서로 분리하고 다리로 연결해 놓은 듯이 표현한 패턴을 브릿지 패턴이라고 한다
         */
        Bridge bridge1 = new FastRun(new PersonA("C"));
        bridge1.walking();
        bridge1.run();

        Bridge bridge2 = new Run(new PersonB("D"));
        bridge2.walking();
        bridge2.run();
    }
}
