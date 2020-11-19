package pattern.behavioral.state;

public class DeleteButton implements State {
    @Override
    public void button() {
        System.out.println("삭제");
    }
}
