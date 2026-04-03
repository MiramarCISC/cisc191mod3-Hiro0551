package edu.sdccd.cisc191;

public abstract class Shape {
    protected String name;

    public Shape(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }
    public abstract double area();
    public abstract double perimeter();

    public String describe() {
        return getClass().getSimpleName() + " " + name;
    }
    @Override
    public String toString(){
        return describe() + " area=" + area();
    }
}