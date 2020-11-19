package pattern.structural.decorator;

public abstract class Decorator implements ChristmasTree {
    private ChristmasTree christmasTree;

    public Decorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
