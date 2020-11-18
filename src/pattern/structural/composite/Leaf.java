package pattern.structural.composite;

public class Leaf implements Component {
    private int num = 0;

    Leaf() { }

    Leaf(int num) {
        this.num = num;
    }

    @Override
    public void operation() {
        System.out.println("Leaf Node - " + num);
    }
}
