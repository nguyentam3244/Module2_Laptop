package class_and_oop;

public class BuildFan {
    final int Slow=1;
    final int Medium=2;
    final int Fast=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    // hàm tham số mặc định
    public BuildFan(){
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }


    //hàm lấy tham số
    public BuildFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //set và get của speed
    public int getSlow(){
        return Slow;
    }
    public int getMedium(){
        return Medium;
    }
    public int getFast(){
        return Fast;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed =speed;
    }

    //set và get của công tắc
    public boolean isOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }

    //set và get của radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    //set vaf get của màu Fan
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }


    @Override
    public String toString() {
        return this.on ?
                "Fan is on " + " speed= " + getSpeed() + ", radius= " + getRadius() + ", color=" + getColor() :
                "Fan is of " + "radius=" + getRadius() + ", color=" + getColor() ;
    }

    public static void main(String[] args) {
        BuildFan fanObj1 = new BuildFan(4, true, 20, "black");
        BuildFan fanObj2 = new BuildFan(10, false, 10, "red");
        System.out.println(fanObj1.toString());
        System.out.println(fanObj2.toString());
    }
}
