package pattern.structural.bridge;

public class PersonB implements BridgeHandler {
    String name;

    PersonB(String name) {
        this.name = name;
    }

    @Override
    public void walking() {
        System.out.println(this.name + " 빨리 걷는다");
    }
}
