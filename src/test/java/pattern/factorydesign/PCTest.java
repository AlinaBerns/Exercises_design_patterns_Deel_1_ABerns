package pattern.factorydesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {

    private Computer pc;

    @BeforeEach
    void setUp () {
        pc = ComputerFactory.createComputer(Type.PC, "16 GB", "4.1 GHz", "2 TB");
    }

    @Test
    void toStringTest () {
        String pcToString = pc.toString();
        String test = "PC{ram='16 GB', cpu='4.1 GHz', hdd='2 TB'}";

        assertEquals(pcToString, test);
    }

}