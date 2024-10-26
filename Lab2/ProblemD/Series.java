package Lab2.ProblemD;

public class Series extends Circuit 
{
  private Circuit c;
  private Circuit s;
  public Series(Circuit a, Circuit b) 
  {
    this.c=a;
    this.s=b;
  }

  public double getResistance() 
  {
     return this.c.getResistance()+this.s.getResistance();
  }
  
  public double getPotentialDiff() 
  {
  return c.getPotentialDiff()+s.getPotentialDiff();
  }

  public void applyPotentialDiff(double V) 
  {
    double totalResistance = getResistance();
    double cur = V / totalResistance;  
    c.applyPotentialDiff(cur * c.getResistance()); 
    s.applyPotentialDiff(cur * s.getResistance());
  }
}
