package pattern.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String color;
    private int num;

    public ConcreteFlyweight(String color) {
        this.color = color;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void print() {
        System.out.println("color : " + color + " / " + "num : " + num);
    }
}
