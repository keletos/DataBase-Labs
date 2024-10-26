package Lab2.ProblemD;

public abstract class Circuit 
{
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);
    
    public double getPower() 
    {
      double V = getPotentialDiff();
  
      return Math.pow(V, 2)/getResistance();
    }
    public double getCurrent() 
    {
      return getPotentialDiff()/getResistance();
    }
  }