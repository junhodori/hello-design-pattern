package pattern.structural.bridge;

public class FastRun extends Bridge {
    FastRun(BridgeHandler bridgeHandler) {
        super(bridgeHandler);
    }

    public void run() {
        System.out.println("그리고 빨리 뛴다");
    }
}
