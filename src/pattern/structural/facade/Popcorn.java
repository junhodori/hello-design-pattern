package pattern.structural.facade;

public class Popcorn {
    String popcorn;

    public void cooking() {
        System.out.println(this.popcorn + " 팝콘 요리 시작");
    }

    public void flavor(String popcorn) {
        this.popcorn = popcorn;
    }

    public String end() {
        return this.popcorn + " 팝콘";
    }
}
