package Lab2.ProblemA;

public class Sphere extends Shape3D 
{
    private double radius;

    public Sphere (double r)
    {
        this.radius = r;
    }

    @Override
    public double volume() 
    {
        return Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea()
    {
        return  4 * Math.PI * radius * radius; 
    }

    @Override
    public String toString()
    {
        return "Volume of ыphere is: " + volume() + ", " + "and its surface area is " + surfaceArea();
    }
}

