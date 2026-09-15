package lesson6.Computer;

public class hdd {


    String name;
    int volume;
    String type;


    public hdd() {
        name = "Seagate";
        volume = 512;
        type = "Внутренний";
    }

    public hdd(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }


    public void printInfo() {
        System.out.println("HDD: " + name);
        System.out.println("Объем: " + volume + " GB");
        System.out.println("Тип: " + type);
    }


}

