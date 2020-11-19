package pattern.behavioral.state;

public class CreateButton implements State {
    @Override
    public void button() {
        System.out.println("생성");
    }
}
