package pattern.composite;

public class Banana implements Ingredient{
    @Override
    public void mix() {
        System.out.println("Mixing ["+Colors.ANSI_YELLOW+"Banana"+Colors.ANSI_RESET+"]");
    }
}
