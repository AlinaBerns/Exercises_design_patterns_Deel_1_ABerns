package pattern.composite;

public class App {
    public static void main(String[] args) {
        Banana banana = new Banana();
        Apple apple = new Apple();
        Sugar sugar = new Sugar();

        Mix mix = new Mix();

        mix.addIngredient(banana);
        mix.addIngredient(banana);
        mix.addIngredient(apple);

        //mix.mix();

        Mix mix1 = new Mix();
        mix1.addIngredient(mix);
        mix1.addIngredient(sugar);

        mix1.mix();
    }
}
