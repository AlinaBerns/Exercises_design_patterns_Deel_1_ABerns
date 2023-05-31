package pattern.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    private Inventory inventory;
    @BeforeEach
    void setUp () {
        inventory = Inventory.getInventory();
    }

    @Test
    void shouldReturnNotNullIfInventoryNotNull () {
        assertNotNull(inventory);
    }

    @Test
    void methodPrintProductsIsCorrect () {
        inventory.printProducts();
    }

    @Test
    void methodAddIsCorrect () {
        inventory.productAdd(new Product("Melk"));
        inventory.productAdd(new Product("Brood"));

        inventory.printProducts();
    }

    @Test
    void methodRemoveIsCorrect () {
        Product productTest1 = new Product("Melk");
        Product productTest2 = new Product("Choco");

        inventory.productAdd(productTest1);
        inventory.productAdd(productTest2);

        inventory.productRemove(productTest1);

        inventory.printProducts();
    }
}