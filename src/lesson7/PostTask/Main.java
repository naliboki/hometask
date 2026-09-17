package lesson7.PostTask;

public class Main {

    public static void main(String[] args) {


        position director = new Director();
        position worker = new worker();
        position accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

    }

}