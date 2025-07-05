 // This is the code snippet that follows the O — pen/Closed Principle
// To add a new shape, we just need to create a new class that implements Shape.
// This means AreaCalculator no longer needs to be changed when new shapes are added.
// So, the system is now open for extension and closed for modification

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
