package pattern.behavioral.command;

public class CommandTest {
    public static void main(String[] args) {
        /**
         * Lamp 클래스의 turnOn() 과 Alarm 클래스의 start() 가 있고,
         * Button 클래스의 pressed() 실행시 동작 시키려고 한다
         *
         * Button 클래스에 Lamp 객체와 Alarm 객체를 직접 넘겨서 처리하게 되면
         * 변경이나 추가가 되었을 때 Button 클래스도 변경이 같이 일어나게 된다
         *
         * 그래서 Command 인터페이스의 execute() 메서드로 통일해야 한다
         * LampCommand 클래스에서는 execute() -> turnOn() 실행하게 하고
         * AlarmCommand 클래스에서는 execute() -> start() 실행하게 한다
         *
         * 마지막으로 Button 클래스는 pressed() -> execute() 동작만 처리하게 하면,
         * Button 클래스 수정 없이 Lamp 와 Alarm 모두 사용 가능하다
         */
        Command command1 = new LampCommand(new Lamp());
        Command command2 = new AlarmCommand(new Alarm());

        Button button = new Button(command1);
        button.pressed();

        button.setCommand(command2);
        button.pressed();

    }
}
