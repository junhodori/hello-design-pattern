package pattern.creational.singleton;

public class Singleton {
    // 싱글톤 객체를 생성해서 클래스 변수로 저장한다
    private static final Singleton instance = new Singleton();

    // 생성자의 접근 제한자를 private로 해서 외부에서 객체를 직접 생성 하는 경우를 막는다
    private Singleton() {}

    // getInstance() 메소드를 통해 한번 생성된 객체를 전달해 준다
    public static Singleton getInstance() {
        return instance;
    }
}
