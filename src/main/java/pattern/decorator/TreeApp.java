package pattern.decorator;

public class TreeApp {
    public static void main(String[] args) {

        //Real Christmas Tree
        RealChristmasTree realChristmasTree = new RealChristmasTree();

        //Christmas Tree with Bubble Lights
        ChristmasTree christmasTreeWithBubbleLights = new BubbleLights(realChristmasTree);
        System.out.println(christmasTreeWithBubbleLights.decorate());

        //Christmas Tree with Garlands
        ChristmasTree christmasTreeWithGarlands = new Garland(realChristmasTree);
        System.out.println(christmasTreeWithGarlands.decorate());

        //Christmas Tree with Tree Topper
        ChristmasTree christmasTreeWithTreeTopper = new TreeTopper(realChristmasTree);
        System.out.println(christmasTreeWithTreeTopper.decorate());




    }
}
