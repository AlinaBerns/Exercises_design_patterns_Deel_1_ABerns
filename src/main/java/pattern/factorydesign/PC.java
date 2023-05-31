package pattern.factorydesign;

public class PC extends Computer{

    public PC(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram='" + getRam() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                ", hdd='" + getHdd() + '\'' +
                '}';
    }
}
