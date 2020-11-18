package pattern.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        // 생성자를 통한 생성은 파라미터가 많을 경우 가독성이 떨어진다
        Person person = new Person("A", 40, "010-3333-3333", 130);
        System.out.println("[생성자 생성] " + person.toString());

        // 자바빈을 통한 생성은 가독성은 좋으나 한번에 객체 생성이 완료되지 않고 파라미터 추가가 계속 되면서 지저분해진다
        Person person1 = new Person();
        person1.setName("A");
        person1.setAge(15);
        person1.setPhoneNum("010-1234-5678");
        person1.setHeight(175);

        System.out.println("[자바빈 생성] " + person1.toString());

        // 빌더를 통한 생성은 가독성도 보장되고 객체도 파라미터를 모두 세팅 한 뒤에 한번에 생성된다
        Person person2 = new Builder().
                setName("B").
                setAge(30).
                setPhoneNum("010-1111-1111").
                setHeight(180).
                builde();

        System.out.println("[빌더 생성] " + person2.toString());

        // 위와 같이 외부에 있는 빌더를 내장 클래스를 이용해 깔끔하게 개선했다
        // 파라미터도 메서드 이름에 set 문자열도 제거해서 가독성을 올렸다
        GoodPerson goodPerson = new GoodPerson.Builder()
                .name("C")
                .age(100)
                .phoneNum("010-9999-9999")
                .height(200)
                .build();
    }
}
