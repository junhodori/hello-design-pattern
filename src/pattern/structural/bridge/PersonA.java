package pattern.structural.bridge;

public class PersonA implements BridgeHandler {
    String name;

    PersonA(String name) {
        this.name = name;
    }

    @Override
    public void walking() {
        System.out.println(this.name + " 천천히 걷는다");
    }
}
