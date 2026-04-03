package edu.sdccd.cisc191;

public class Rectangle extends Shape implements Measurable {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle r)) return false;
        return name.equals(r.name) && width == r.width && height == r.height;
    }
}