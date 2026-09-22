package lesson8;

public class Phone {

    String number;
    String model;
    Double weight;

    public Phone() {

    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " (" + number + ")");
    }
    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено:");

        for (String num : numbers) {
            System.out.println(num);
        }
    }
}

