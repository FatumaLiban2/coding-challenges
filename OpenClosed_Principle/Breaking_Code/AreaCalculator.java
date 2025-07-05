// This is the code snippet that does not follow the O — pen/Closed Principle
// This violates the principle because every time we add a new shape like the Triangle, we must modify the AreaCalculator class.
// AreaCalculator is not closed for modification.

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}

class Circle {
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
