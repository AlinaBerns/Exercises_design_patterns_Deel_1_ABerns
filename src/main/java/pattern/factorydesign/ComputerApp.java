package pattern.factorydesign;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(Type.SERVER);
        Computer computer2 = ComputerFactory.createComputer(Type.PC);

        System.out.println(computer);
        System.out.println(computer2);
    }
}
