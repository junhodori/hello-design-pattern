package pattern.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        // DB에서 원본 데이터를 가져온다 : ["A", "B", "C"]
        prototype.load();

        // 객체를 복사한다
        Prototype prototype1 = (Prototype) prototype.clone();
        Prototype prototype2 = (Prototype) prototype.clone();

        // prototype1 객체에는 "D"를 추가하는 작업을 하고 prototype2에는 "E"를 추가하는 작업을 해서 데이터를 변형한다
        prototype1.getList().add("D");
        prototype2.getList().add("E");

        // prototype1와 prototype2를 출력하면 각각 "D"와 "E"가 추가 되어있다
        System.out.println("[prototype1]" + prototype1.getList());
        System.out.println("[prototype2]" + prototype2.getList());

        // 만약 여기서 원본 데이터가 다시 필요하면 DB에서 다시 읽어야겠지만,
        // 우리를 객체를 복사해서 사용했기 때문에 원본은 그대로 보존되어 있다
        System.out.println("[prototype]" + prototype.getList());


    }
}
