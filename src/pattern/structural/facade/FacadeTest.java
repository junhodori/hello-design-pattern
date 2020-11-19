package pattern.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        // 팝콘 클래스에서는 팝콘의 맛을 선택하고 요리를 시작해야하는 작업을 해야한다
        Popcorn popcorn = new Popcorn();
        popcorn.flavor("갈릭맛");
        popcorn.cooking();

        String cooked = popcorn.end();

        // 영화 클래스에서는 영화를 선택하고 시작 버튼을 누르고 완성된 팝콘을 가져와서 영화를 시청해야 한다
        Movie move = new Movie();
        move.select("공포");
        move.play();
        move.watching(cooked);
        move.end();

        // 퍼사드를 이용하면 위와 같이 복잡한 팝콘 요리와 영화 시청 기능을 통합해서 제공할 수 있다
        Facade facade = new Facade(new Movie(), new Popcorn());
        facade.watching("멜로", "카라멜");
        facade.end();

    }
}
