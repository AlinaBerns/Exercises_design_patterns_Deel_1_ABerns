package pattern.factorydesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {
    private Computer server;

    @BeforeEach
    void setUp () {
        server = ComputerFactory.createComputer(Type.SERVER, "16 GB", "4.1 GHz", "2 TB");
    }

    @Test
    void toStringTest () {
        String pcToString = server.toString();
        String test = "Server{ram='16 GB', cpu='4.1 GHz', hdd='2 TB'}";

        assertEquals(pcToString, test);
    }
}