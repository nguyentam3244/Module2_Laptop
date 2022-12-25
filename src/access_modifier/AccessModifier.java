package access_modifier;

public class AccessModifier {
    private double radius=1.0;
    private String color ="Red";

    //hàm ko có tham số
    AccessModifier(){

    }

    // hàm có tham số mặc định
    AccessModifier(double radius, String color){
        this.radius = radius;
        this.color = color;
    }


    //get và set radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius= radius;
    }

    // get và set color
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }


    //get của Area
    public double getArea(){
        return radius*radius*Math.PI;
    }
    //toString
    public String toString(){
        return "Circle has " + this.getColor() + " and has area is " + this.getArea();
    }

    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier(4.1,"red");
        System.out.println(obj1.toString());
    }
}
