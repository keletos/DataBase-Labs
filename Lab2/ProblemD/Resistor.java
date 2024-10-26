package Lab2.ProblemD;

public class Resistor extends Circuit 
{
    private double resistance;
    private double potentialDifference;
    public Resistor(double resistance) {
      this.resistance=resistance;
    }
    public void applyPotentialDiff(double V) {
      this.potentialDifference=V;
    }
    public double getResistance() {
      return this.resistance;
    }
    public double getPotentialDiff() {
      return this.potentialDifference;
    }
  }
