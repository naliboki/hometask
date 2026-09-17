package lesson7.HierarchyOfFigures;

public class main {

    public static void main(String[] args) {

        Figures[] figures = new Figures[5];

        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(5, 8);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(2, 7);
        figures[4] = new Circle(5);

        double totalPerimeter = 0;

        for (Figures figure : figures) {

            totalPerimeter += figure.getPerimeter();

            System.out.println("площадь: " + figure.getArea());
            System.out.println("периметр: " + figure.getPerimeter());
            System.out.println();
        }

        System.out.println("сумма всех периметров: " + totalPerimeter);

    }
}