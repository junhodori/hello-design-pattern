package pattern.behavioral.state;

public class StateTest {
    public static void main(String[] args) {
        // 조건문이 많아지는 경우 상태 패턴을 이용하면 조건문이 제거되고 가독성이 좋게 된다
        Context context = new Context();
        context.setState(new CreateButton());
        context.button();

        context.setState(new UpdateButton());
        context.button();

        context.setState(new DeleteButton());
        context.button();
    }
}
