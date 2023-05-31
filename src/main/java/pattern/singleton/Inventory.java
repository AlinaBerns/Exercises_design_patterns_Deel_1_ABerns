package pattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Inventory {
    private static Inventory inventory;
    private List<Product> products;

    private Inventory() {
        this.products = new ArrayList<>();
    }

    public static Inventory getInventory() {
        if (inventory == null) {
            inventory = new Inventory();
        }

        return inventory;
    }

    public void productAdd (Product product){
        products.add(product);
    }

    public void productRemove (Product product){
        products.remove(product);
    }

    public void printProducts() {
        products.forEach(System.out::println);
    }
}
