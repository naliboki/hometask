package lesson10;

public class DocumentProcessing {

    public static void printFirstBlocks(String document) {
        String[] parts = document.split("-");
        System.out.println(parts[0] + parts[2]);
    }

    public static void replaceLetters(String document) {
        String result = document.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(result);
    }


    public static void printLettersLower(String document) {
        String[] parts = document.split("-");
        System.out.println(parts[1].toLowerCase() + "/"
                + parts[3].toLowerCase() + "/"
                + parts[4].substring(1).toLowerCase());
    }


    public static void printLettersUpper(String document) {
        String[] parts = document.split("-");

        StringBuilder builder = new StringBuilder();

        builder.append("Letters:");
        builder.append(parts[1].toUpperCase()).append("/");
        builder.append(parts[3].toUpperCase()).append("/");
        builder.append(parts[4].substring(1).toUpperCase());

        System.out.println(builder);
    }


    public static void containsABC(String document) {
        if (document.toLowerCase().contains("abc")) {
            System.out.println("Документ содержит abc");
        } else {
            System.out.println("Документ не содержит abc");
        }
    }


    public static void starts555(String document) {
        if (document.startsWith("555")) {
            System.out.println("Документ начинается с 555");
        } else {
            System.out.println("Документ не начинается с 555");
        }
    }


    public static void ends1a2b(String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            System.out.println("Документ не заканчивается на 1a2b");
        }
    }

}