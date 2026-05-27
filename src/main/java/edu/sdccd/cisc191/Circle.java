package edu.sdccd.cisc191;

public class Circle extends Shape implements Measurable {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Circle c)) return false;
    return name.equals(c.name) && Double.compare(radius, c.radius) == 0;
}

@Override
public int hashCode() {
    return java.util.Objects.hash(name, radius);
}
