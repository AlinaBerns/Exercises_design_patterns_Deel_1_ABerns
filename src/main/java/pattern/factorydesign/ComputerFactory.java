package pattern.factorydesign;

import java.util.Optional;

public class ComputerFactory {
    public static Computer createComputer(Type type, String ram, String cpu, String hdd) {
        switch (type) {
            case PC:
                return new PC(ram, cpu, hdd);

            case SERVER:
                return new Server(ram, cpu, hdd);

            default: return null;
        }
    }
}
