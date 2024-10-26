package Lab2.ProblemA;

public class Cube extends Shape3D 
{
    private double sideLength;

    public Cube (double a)
    {
        this.sideLength = a;
    }

    @Override
    public double volume() 
    {
        return sideLength * sideLength * sideLength;
    }

    @Override
    public double surfaceArea()
    {
        return  6 * sideLength * sideLength; 
    }

    @Override
    public String toString()
    {
        return "Volume of cube is: " + volume() + ", " + "and its surface area is " + surfaceArea();
    }
}
