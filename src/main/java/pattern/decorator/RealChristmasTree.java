package pattern.decorator;

public class RealChristmasTree implements ChristmasTree {
    @Override
    public String decorate() {
        return "christmas tree";
    }
}
