package pattern.factorydesign;

public class ComputerFactory {
    public static Computer createComputer(Type type) {
        switch (type) {
            case PC:
                return new PC("16 GB", "4.1 GHz", "2 TB");

            case SERVER:
                return new Server("28 GB", "4.1 GHz", "10 TB");

            default: return null;
        }
    }
}
