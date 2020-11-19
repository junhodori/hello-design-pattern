package pattern.behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {
        /**
         * 특정 시점에 객체의 상태 값을 저장한다
         * Originator 상태가 저장이 되어야 할 대상 클래스이다
         * CareTaker 특정 시점의 상태 값을 리스트로 보관 할 클래스이다
         */
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        // caretaker 첫번째 저장
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        // caretaker 두번째 저장
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State : " + originator.getState());

        // caretaker 첫번째 로드
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State : " + originator.getState());

        // caretaker 번째 로드
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State : " + originator.getState());


    }
}
