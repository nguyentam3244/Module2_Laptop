package class_and_oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta;
        delta = this.b*this.b - (4*this.a*this.c);
        return delta;
    }

    public double getRoot1(){
        double r1;
        r1 = (-this.b + Math.sqrt(Math.pow(this.b,2) - (4*this.a*this.c))) / 2*this.a;

        return r1;
    }

    public double getRoot2(){
        double r2 = (-this.b - Math.sqrt(Math.pow(this.b,2) - (4*this.a*this.c))) / 2*this.a;
        return r2;
    }
    public double getRoot3(){
        double r3 = -this.b/2*this.a;
        return r3;
    }
    public static void main(String[] args) {
        QuadraticEquation obj1 =  new QuadraticEquation();
        obj1.setA(1);
        obj1.setB(2);
        obj1.setC(3);
        double delta = obj1.getDiscriminant();
        if(delta > 0){
            System.out.println("The equation has two roots " + obj1.getRoot1() + " and " + obj1.getRoot2());
        } else if(delta == 0){
            System.out.println("The equation has a root " + obj1.getRoot3());
        } else {
            System.out.println("The equation has no real root");
        }
    }

}
