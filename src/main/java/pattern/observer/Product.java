package pattern.observer;

public class Product {

    private String nameProduct;

    public Product() {
    }

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
