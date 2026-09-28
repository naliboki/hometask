package lesson9;

public class Main {

    static void main(String[] args) {

        String document = "555abc671a2b";
        try {
            DocumentСheck.check(document);
        } catch (AbcException e) {
            System.out.println(e.getMessage());
        } catch (Startexception e) {
            System.out.println(e.getMessage());
        } catch (Endexeption e) {
            System.out.println(e.getMessage());
        }
    }
}
