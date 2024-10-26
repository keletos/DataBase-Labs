package Lab2.ProblemD;

public class Parallel extends Circuit 
{
  private Circuit c;
  private Circuit s;
  public Parallel(Circuit a, Circuit b) {
    this.c=a;
    this.s=b;
  }
  public void applyPotentialDiff(double V) {
    c.applyPotentialDiff(V); 
    s.applyPotentialDiff(V);
  }
  public double getResistance() {
    double a1=c.getResistance();
    double a2=s.getResistance();
    return (a1*a2)/(a1+a2);
  }
  public double getPotentialDiff() {
    return c.getPotentialDiff();
  }
}
