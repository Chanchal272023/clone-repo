package sample1;
public class Area1 {

    public static void circleArea(int radius)
    {

        float area =3.14f*radius*radius;
        System.out.println("area of cirlce="+area);
    }

    public static void squareArea(int side)
    {
        float area=side*side;
        System.out.println("area of square="+area);

    }
    public void triangleArea(int base,int height )
    {
        float area=3.14f*base*height;
        System.out.println("area of triangle="+area);
    }

    public static void main(String[] args) {
        Area1 a=new Area1();
        a.triangleArea(4,5);
        Area1.circleArea(5);
        Area1.squareArea(5);
    }
}
