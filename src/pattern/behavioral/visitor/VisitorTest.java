package pattern.behavioral.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        /**
         * Bus 객체의 기능은 다음과 같다
         * getFuel() : 기름 확인
         * drive() : 운행 (한번에 기름 1 이 소모)
         */
        Bus bus = new Bus(5);
        System.out.println("현재 버스 기름 : " + bus.getFuel());
        bus.drive();
        bus.drive();
        bus.drive();
        System.out.println("현재 버스 기름 : " + bus.getFuel());

        /**
         * 기름 넣는 기능은 방문자 객체를 이용해서 처리한다
         * 방문자 객체로서 GasStation 객체가 Bus 객체에 방문하여 데이터를 받아와서 처리한다
         *
         */
        bus.visit(new GasStation(8));
        System.out.println("현재 버스 기름 : " + bus.getFuel() + "\n");

        /**
         * Truck 객체의 기능은 다음과 같다
         * getFuel() : 기름 확인
         * drive() : 운행 (한번에 기름 2 이 소모)
         */
        Truck truck = new Truck(4);
        System.out.println("현재 트럭 기름 : " + truck.getFuel());
        truck.drive();
        truck.drive();
        System.out.println("현재 버스 기름 : " + truck.getFuel());

        /**
         * 기름 넣는 기능은 방문자 객체를 이용해서 처리한다
         * 방문자 객체로서 GasStation 객체가 Truck 객체에 방문하여 데이터를 받아와서 처리한다
         * (트럭은 주유소에서 보너스로 5 리터를 더 넣어 준다)
         */
        truck.visit(new GasStation(10));
        System.out.println("현재 트럭 기름 : " + truck.getFuel() + "\n");

    }
}
