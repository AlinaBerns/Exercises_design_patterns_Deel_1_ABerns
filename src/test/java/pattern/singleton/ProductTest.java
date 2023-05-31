package pattern.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setProduct () {
        product = new Product("Choco");
    }


    @Test
    void testToString() {
        String test = "Product{name='Choco'}";
        String realProduct = product.toString();

        assertEquals(test, realProduct);
    }
}