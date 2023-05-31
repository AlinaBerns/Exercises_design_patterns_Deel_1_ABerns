package pattern.factorydesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFactoryTest {
    private Computer test;

    @DisplayName(value = "Should return null if value id DEFAULT")
    @Test
    void setUp () {
        test = ComputerFactory.createComputer(Type.NULL_TEST, "16 GB", "4.1 GHz", "2 TB");

        assertNull(test);
    }

}