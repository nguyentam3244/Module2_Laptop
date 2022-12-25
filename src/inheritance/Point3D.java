package inheritance;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = this.z;
        arr[1] = this.z;
        arr[2] = this.z;
        return arr;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }

    public static void main(String[] args) {
        Point2D first2DPoint=new Point2D(5, 8);
        System.out.println(first2DPoint.toString());


        Point3D first3DPoint=new Point3D(first2DPoint.getX(), first2DPoint.getY(), 9);
        System.out.println(first3DPoint.toString());
    }
}
