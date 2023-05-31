package pattern.factorydesign;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(Type.SERVER, "16 GB", "4.1 GHz", "2 TB");
        Computer computer2 = ComputerFactory.createComputer(Type.PC, "16 GB", "4.1 GHz", "2 TB");

        System.out.println(computer);
        System.out.println(computer2);
    }
}
