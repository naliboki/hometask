package lesson7.HierarchyOfFigures;

public class Rectangle extends Figures {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override

    public double getArea() {
        return width * height;
    }

    @Override

    public double getPerimeter() {
        return 2 * (width + height);
    }


}