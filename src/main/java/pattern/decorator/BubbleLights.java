package pattern.decorator;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    @Override
    public String decorate() {
        return super.decorate() + " with bubble lights";
    }
}
