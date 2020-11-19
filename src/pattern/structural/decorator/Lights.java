package pattern.structural.decorator;

public class Lights extends Decorator {
    public Lights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " + lights";
    }
}
