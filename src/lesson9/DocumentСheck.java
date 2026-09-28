package lesson9;

public class DocumentСheck {
    public static void check(String number)
        throws AbcException, Startexception, Endexeption {

        if (!number.contains("abc")) {
            throw new AbcException("Документ не содержит abc");
        }

        if (!number.startsWith("555")) {
            throw new Startexception("Документ должен начинаться с 555");

        }

        if (!number.endsWith("1a2b")) {
            throw new Endexeption("Документ должен заканчиваться на 1a2b");

        }
        System.out.println("Документ корректный");
    }
}
