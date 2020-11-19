package pattern.structural.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        String[] color = {"RED", "RED", "BLUE", "YELLOW", "YELLOW", "YELLOW", "RED", "GREEN", "BLUE", "BLUE"};
        /**
         * 10개의 객체를 만들어야 하고 동일한 컬러의 객체에 대해서는 재사용 하려고 한다
         * 플라이웨이트 패턴을 사용하면 팩토리가 객체를 생성해서 전달해 줄때
         * 이전에 이미 생성된 컬러의 객체가 있으면 새로 생성하지 않고 저장된 객체를 전달해 준다
         */
        for (int x = 0; x < 10; x++) {
            ConcreteFlyweight concreteFlyweight = (ConcreteFlyweight) FlyweightFactory.getFlyweight(color[x]);
            concreteFlyweight.setNum(x);
            concreteFlyweight.print();
        }
    }
}
