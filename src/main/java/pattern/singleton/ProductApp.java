package pattern.singleton;

public class ProductApp {
    public static void main(String[] args) {

        Inventory inventory = Inventory.getInventory();

        Product product1 = new Product("Brood");
        Product product2 = new Product("Melk");
        Product product3 = new Product("Choco");

        inventory.productAdd(product1);
        inventory.productAdd(product2);
        inventory.productAdd(product3);

        //Should return "Brood", "Melk" and "Choco"
        System.out.println("-".repeat(100));
        inventory.printProducts();

        inventory.productRemove(product2);

        //Should return "Brood" and "Choco"
        System.out.println("-".repeat(100));
        inventory.printProducts();
    }
}
