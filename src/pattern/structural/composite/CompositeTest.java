package pattern.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        // 리프 클래스는 파일이라고 생각하면 된다
        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(2);
        Leaf leaf3 = new Leaf(3);
        Leaf leaf4 = new Leaf(4);

        // 컴포지트 클래스는 디렉토리라고 생각하면 된다
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        // 컴포지트2 에 리프 1,2,3 을 추가한다
        composite2.add(leaf1);
        composite2.add(leaf2);
        composite2.add(leaf3);

        // 컴포지트3 에 리프 4 를 추가한다
        composite3.add(leaf4);

        // 컴포지트1 에 컴포지트 2,3을 추가한다
        composite1.add(composite2);
        composite1.add(composite3);

        // 컴포지트1을 실행하면 그 하위의 컴포지트들도 실행되면서
        // 안에 있는 리프까지 모두 동일 메서드로 실행된다
        composite1.operation();


    }
}
