package lesson8;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+123456", "samsung", 180);
        Phone phone2 = new Phone("+789012", "iphone", 170);
        Phone phone3 = new Phone("+987654", "xiaomi", 195);


        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        System.out.println();


        phone1.receiveCall("Дима");
        phone2.receiveCall("Варвара");
        phone3.receiveCall("Ваня");

        System.out.println();


        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println();


        phone1.receiveCall("Дима", "+102938");


        System.out.println();

        phone1.sendMessage("+123456", "+789012", "+987654");
    }
}