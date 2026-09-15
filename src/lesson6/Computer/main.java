package lesson6.Computer;

public class main {
    public static void main(String[] args) {

        computer computer1 = new computer(2000, "Lenovo");

        ram ram = new ram("Corsair", 32);
        hdd hdd = new hdd("Samsung SSD", 1000, "Внутренний");

        computer computer2 = new computer(5000, "Asus", ram, hdd);

        computer1.printInfo();
        computer2.printInfo();

    }

}
