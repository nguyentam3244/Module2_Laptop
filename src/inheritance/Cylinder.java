package inheritance;

public class Cylinder extends Circle {
    public double h;

    public Cylinder(){

    }

    public Cylinder(double r, String color,double h){
        super(r,color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getVolume(){
        return super.getArea() * h;
    }

    public String toString(){
        return super.toString() + " Volume " + getVolume();
    }

    public static void main(String[] args) {
        Circle circleObj1 = new Circle(3, "red");
        System.out.println(circleObj1.toString());
        Cylinder cylinderObj1 = new Cylinder(4,"black", 5);
        System.out.println(cylinderObj1.toString());
    }
}
