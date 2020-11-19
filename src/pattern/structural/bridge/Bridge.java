package pattern.structural.bridge;

public abstract class Bridge {
    BridgeHandler bridgeHandler;

    Bridge(BridgeHandler bridgeHandler) {
        this.bridgeHandler = bridgeHandler;
    }

    public void walking() {
        bridgeHandler.walking();
    }

    abstract void run();
}
