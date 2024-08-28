package ocp;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
};

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
};

public class AreaCalculator {

    public double area(Rectangle[] shapes) {
        double area = 0;
        for (Rectangle shape : shapes) {
            area += shape.getWidth() * shape.getHeight();
        }
        return area;
    }

    public double area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth() * rectangle.getHeight();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                area += Math.PI * circle.getRadius() * circle.getRadius();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(3, 6);
        Circle circle1 = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();

        Rectangle[] rectangles = {rect1, rect2};
        System.out.println("Total Rectangle Area: " + calculator.area(rectangles));

        Object[] shapes = {rect1, rect2, circle1};
        System.out.println("Total Shape Area: " + calculator.area(shapes));
    }
}

//Here if we have to add another shape lets say triangle by this code we have to modify area method of AreaCalculator class hence it do not follow ocp.

