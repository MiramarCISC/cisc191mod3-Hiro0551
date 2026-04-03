package edu.sdccd.cisc191;

public class Triangle extends Shape implements Measurable {
    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0 || a + c <= b || a + b <= c || c + b <= a) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    public double perimeter() {
        return a + b + c;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle t)) return false;
        return name.equals(t.name) && a == t.a && b == t.b && c == t.c;
    }
}