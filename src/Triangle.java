public class Triangle extends Shape {
    double side1 = 1, side2 = 1, side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double p = this.side1 + this.side2 + this.side3;
        return p;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        double s = Math.pow((p*(p-this.side1)*(p-this.side2)*(p-this.side3)), 0.5);
        return s;
    }

    @Override
    public String toString() {
        return "Tam giác có chiều dài 3 cạnh " +
                side1 + ", " + side2 + ", " + side3 +
                ", chu vi " + this.getPerimeter() +
                " diện tích " + this.getArea();
    }
}
