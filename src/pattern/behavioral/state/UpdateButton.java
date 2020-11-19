package pattern.behavioral.state;

public class UpdateButton implements State {
    @Override
    public void button() {
        System.out.println("업데이트");
    }
}
