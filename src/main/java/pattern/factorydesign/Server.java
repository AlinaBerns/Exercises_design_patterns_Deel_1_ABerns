package pattern.factorydesign;

public class Server extends Computer{
    public Server(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + getRam() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                ", hdd='" + getHdd() + '\'' +
                '}';
    }
}
