package laptop_class;

public class laptop {

    public int id;
    public int memory;
    public int HDD;
    public String cpuName;
    public String osName;
    public String model;


    
    @Override
    public String toString() {
        return String.format("id:%d m:%s h%d cn:%s o:%d md:$s", id, memory, HDD, cpuName, osName, model);
    }

    @Override
    public boolean equals(Object o) {
        laptop t = (laptop) o;
        return id == t.id && cpuName == t.cpuName;
    }
    @Override
    public int hashCode() {
        return id;
    }
    
}
