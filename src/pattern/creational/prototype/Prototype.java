package pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private List<String> list = new ArrayList<>();

    Prototype() { }

    Prototype(List<String> list) {
        this.list = list;
    }

    // DB에서 데이터를 가져온다고 가정한다 : ["A", "B", "C"]
    public void load() {
        list.add("A");
        list.add("B");
        list.add("C");
    }

    public List<String> getList() {
        return list;
    }

    // Cloneable 인터페이스를 상속받아서 clone 메서드를 구현한다
    // super.clone()으로 복사하면 객체는 복사 되지만,
    // list는 모두 동일한 주소를 참조하고 있으므로 값 변경시 객체 간에 서로 영향을 미친다
    // 그러므로 list 변수에 있는 값을 깊은 복사(Deep Copy)하여 새로운 객체에 같이 넘겨줘야한다
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (int x = 0; x < list.size(); x++) {
            temp.add(list.get(x));
        }
        return new Prototype(temp);
        // return super.clone();
    }
}
