package lesson1.polimorphism;

//треугольник
public class Triangle extends Shape {
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(double sideLength1, double sideLength2, double sideLength3) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }


    public double getSideLength1() {
        return sideLength1;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    public double getSideLength3() {
        return sideLength3;
    }

    public void setSideLength3(double sideLength3) {
        this.sideLength3 = sideLength3;
    }

    //расчет площади
    @Override
    public double area() {
        double semiPerimeter;
        double areaTriangle;

        //полупериметр
        semiPerimeter=(sideLength1+sideLength2+sideLength3)/2;
        //площадь
        areaTriangle=Math.sqrt(semiPerimeter*(semiPerimeter-sideLength1)*(semiPerimeter-sideLength2)*(semiPerimeter-sideLength3));
        return areaTriangle;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sideLength1=" + sideLength1 +
                ", sideLength2=" + sideLength2 +
                ", sideLength3=" + sideLength3 +
                '}';
    }
}


