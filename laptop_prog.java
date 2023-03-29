import laptop_class.laptop;

public class laptop_prog {

    public static void main(String[] args) {

        laptop l1 = new laptop();
        l1.model = "LG Gram Style 14";
        l1.memory = 8;
        l1.HDD = 256;
        l1.cpuName = "CPU  Intel Core i7 1360P,GHz 2,2";
        l1.osName = "Windows Precision";
        l1.id = 214;

        laptop l2 = new laptop();
        l2.model = "Asus Zenbook 14 OLED (UM3402)";
        l2.memory = 8;
        l2.HDD = 256;
        l2.cpuName = "AMD Ryzen 5 5625U,GHz  2,3";
        l2.osName = "Windows Precision";
        l2.id = 111;

        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));
        System.out.println(l1.toString());
        System.out.println(l2);

        var laptops = new HashSet<laptop>(Arrays.asList(l1));
        System.out.println(laptops.contains(l2));

    }
    
}


