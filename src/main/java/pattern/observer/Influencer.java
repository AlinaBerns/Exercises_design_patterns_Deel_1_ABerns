package pattern.observer;

public class Influencer implements Observer{
    private String name;
    public Influencer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Beste " + getName()
                + "\nWe hebben een nieuwe product ontvangen: " + product + "\n"+"=".repeat(100));
    }
}
