package inheritance;

public class MoveAblepoint extends Point{
    private double xSpeed = 0.0f;
    private double ySpeed = 0.0f;

    public MoveAblepoint() {
    }

    public MoveAblepoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed(double xSpeed, double ySpeed) {
        double[] arr2 = new double[2];
        arr2[0] = this.xSpeed;
        arr2[1] = this.ySpeed;
        return arr2;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
    }

    public String move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    public static void main(String[] args) {
        Point2D obj1 = new Point2D(2, 3);
        MoveAblepoint point = new MoveAblepoint(0, 0, 1, 2);
        System.out.println(obj1);
        System.out.println(point);
        System.out.println(point.move());
    }
}
