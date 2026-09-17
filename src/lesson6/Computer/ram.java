package lesson6.Computer;

public class ram {

    String name;
    int volume;


    public ram() {
        name = "Kingston";
        volume = 8;
    }

    public ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("RAM: " + name + ", " + volume + " GB");

    }


}
