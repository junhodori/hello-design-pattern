package pattern.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // 생성자의 접근 제한자가 private 이므로 new 키워드로 객체를 생성할 수 없다
        // Singleton singleton = new Singleton();

        // getInstance() 메소드를 통해서만 이미 생성되어있는 객체를 받아올 수 있다
        Singleton singleton = Singleton.getInstance();

        // 객체를 한번 더 받아와서 비교해도 동일한 객체로 확인된다
        Singleton singleton2 = Singleton.getInstance();
        if (singleton == singleton2) System.out.println("동일");
    }
}
