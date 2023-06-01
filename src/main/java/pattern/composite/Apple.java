package pattern.composite;

public class Apple implements Ingredient{
    @Override
    public void mix() {
        System.out.println("Mixing [Apple]");
    }
}
