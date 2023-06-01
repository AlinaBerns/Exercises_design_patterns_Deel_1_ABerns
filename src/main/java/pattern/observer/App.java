package pattern.observer;

public class App {
    public static void main(String[] args) {
        Company company = new Company();

        Influencer influencer1 = new Influencer("Paul");
        Influencer influencer2 = new Influencer("Brian");
        Influencer influencer3 = new Influencer("Ben");

        company.addObserver(influencer1);
        company.addObserver(influencer2);
        company.addObserver(influencer3);

        company.createNewProduct(new Product("WINDOWS 2036"));

        company.removeObserver(influencer1);
        company.createNewProduct(new Product("LINUX RED 65100"));


    }
}
