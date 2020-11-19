package pattern.structural.decorator;

public class Flowers extends Decorator {
    public Flowers(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " + flower";
    }
}
