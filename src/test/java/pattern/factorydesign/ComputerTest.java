package pattern.factorydesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    private Computer computerPC;
    private Computer computerServer;

    @BeforeEach
    void setComputer () {
        computerPC = ComputerFactory.createComputer(Type.PC, "16 GB", "4.1 GHz", "2 TB");
        computerServer = ComputerFactory.createComputer(Type.SERVER, "16 GB", "4.1 GHz", "2 TB");
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.PC: ram)")
    @Test
    void testSetAndGetTypePCRam () {
        String test = "16 GB";
        String realRam = computerPC.getRam();

        assertEquals(test, realRam);
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.PC: cpu)")
    @Test
    void testSetAndGetTypePCCpu () {
        String test = "4.1 GHz";
        String realCpu = computerPC.getCpu();

        assertEquals(test, realCpu);
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.PC: hdd)")
    @Test
    void testSetAndGetTypePCHdd () {
        String test = "2 TB";
        String realHdd = computerPC.getHdd();

        assertEquals(test, realHdd);
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.Server: ram)")
    @Test
    void testSetAndGetTypeServerRam () {
        String test = "16 GB";
        String realRam = computerServer.getRam();

        assertEquals(test, realRam);
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.Server: cpu)")
    @Test
    void testSetAndGetTypeServerCpu () {
        String test = "4.1 GHz";
        String realCpu = computerServer.getCpu();

        assertEquals(test, realCpu);
    }

    @DisplayName(value = "Test of setters and getters (Computer Type.Server: hdd)")
    @Test
    void testSetAndGetTypeServerHdd () {
        String test = "2 TB";
        String realHdd = computerServer.getHdd();

        assertEquals(test, realHdd);
    }

    @DisplayName(value = "Constructor isn't null")
    @Test
    void shouldReturnNotNullIfConstructorIsNotNull () {
        assertAll(
                () -> assertNotNull(computerServer),
                () -> assertNotNull(computerPC)
        );
    }
}