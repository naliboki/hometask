package lesson10;

public class Main {

    public static void main(String[] args) {

        String document = "5555-abc-1234-qwe-1a2b";

        DocumentProcessing.printFirstBlocks(document);
        DocumentProcessing.replaceLetters(document);
        DocumentProcessing.printLettersLower(document);
        DocumentProcessing.printLettersUpper(document);
        DocumentProcessing.containsABC(document);
        DocumentProcessing.starts555(document);
        DocumentProcessing.ends1a2b(document);

    }


}