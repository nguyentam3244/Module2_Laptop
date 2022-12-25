package inheritance;

public class Circle {
    public double r;
    public String color;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea ()

    {
        return this.getR() * this.getR() * 3.14;

    }

    public String toString() {
        return "Ban kinh:" + getR() + " Mau:" + getColor() + " Dien tich: " + getArea();
    }
}
