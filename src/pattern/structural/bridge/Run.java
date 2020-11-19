package pattern.structural.bridge;

public class Run extends Bridge {
    Run(BridgeHandler bridgeHandler) {
        super(bridgeHandler);
    }

    public void run() {
        System.out.println("그리고 뛴다");
    }
}
