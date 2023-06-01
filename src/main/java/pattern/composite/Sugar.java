package pattern.composite;

public class Sugar implements Ingredient{
    @Override
    public void mix() {
        System.out.println("Mixing [Sugar]");
    }
}
