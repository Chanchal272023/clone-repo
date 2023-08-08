package sample1;

public class Area {

    public static void main(String[] args) {

        Triangle t=new Triangle();
       float a= t.triangleArea(5f,10f);
        System.out.println("area of triangle="+a);
        float a1=Square.squareArea(10f);
        System.out.println("area of square="+a1);
        float a2=Circle.circleArea(3.5f);
        System.out.println("area of circle="+a2);


    }
}
