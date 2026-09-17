package lesson6.creditcard;

class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1111", 500);
        CreditCard card2 = new CreditCard("2222", 1000);
        CreditCard card3 = new CreditCard("3333", 750);

        card1.deposit(300);
        card2.deposit(200);

        card3.withdraw(150);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}