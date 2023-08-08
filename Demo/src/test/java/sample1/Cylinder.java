package sample1;

public class Cylinder {

int h,r;
    public Cylinder()
    {
      h=10;
      r=5;
    }

    public  Cylinder(int height, int radius)
    {
        h=height;
        r=radius;

    }

    public float volume()
    {
        float v= 3.14f*h*r*r;
        return v;
    }



    public static void main(String[] args) {

        Cylinder c= new Cylinder();
        System.out.println("cylinder volume with default constructor="+c.volume());
        Cylinder c1=new Cylinder(4,5);
        System.out.println("cylinder volume with parametrized constructor="+c1.volume());

    }
}
