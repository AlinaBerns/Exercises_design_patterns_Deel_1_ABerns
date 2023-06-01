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
        return Colors.ANSI_GREEN + nameProduct + Colors.ANSI_RESET;
    }
}
