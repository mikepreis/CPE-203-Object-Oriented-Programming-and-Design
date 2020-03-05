import java.util.Random;

public class Circle
{
    public static final double PI = 3.14159;
    private double radius;

    public Circle()
    {
        Random rand = new Random();
        radius = rand.nextDouble()*10;
    }
    public Circle(double radius){
        if (radius == 0)
            try {
                throw new ZeroRadiusException();
            } catch (ZeroRadiusException e) {
                e.printStackTrace();
            }

        if (radius < 0)
            try {
                throw new NegativeRadiusException(radius);
            } catch (NegativeRadiusException e) {
                e.printStackTrace();
            }

        this.radius = radius;
    }

    public double radius()
    {
        return radius;
    }
    
    public double diameter()
    {
        return radius*2;
    }
    
    public double circumference()
    {
        return 2*PI*radius;
    }
    
    public double area()
    {
        return PI*radius*radius;
    }
    
    public String toString()
    {
        return "Radius: " + radius;
    }
}