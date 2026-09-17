package lesson6.Computer;

public class computer {

    int price;
    String model;
    ram ram;
    hdd hdd;


    public computer(int price, String model) {
        this.price = price;
        this.model = model;

        ram = new ram();
        hdd = new hdd();
    }

    public computer(int price, String model, ram ram, hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }


    public void printInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Стоимость: " + price);

        ram.printInfo();
        hdd.printInfo();


        System.out.println(" ");
        System.out.println(" ");
    }


}
