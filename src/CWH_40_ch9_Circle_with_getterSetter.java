import java.util.Scanner;

class circle2 {
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public float area2(){
        return area = 3.14f * (radius * radius);
    }

    public float perimeter2(){
        return perimeter = 2 * (3.14f * radius);
    }
}
public class CWH_40_ch9_Circle_with_getterSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle2 ci = new circle2();
        System.out.print("Enter the radius: ");
        ci.setRadius(sc.nextInt());

        System.out.println("Given Radius is: "+ ci.getRadius());
        System.out.printf("Area of Circle is: %.2f\n",ci.area2());
        System.out.printf("Parameter of the Circle is: %.2f\n",ci.perimeter2());

    }
}
