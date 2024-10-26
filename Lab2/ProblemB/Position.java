package Lab2.ProblemB;


public class Position 
{
    private int row;
    private int col;
    
    public Position(int row, int col) 
    {
    if (row < 0 || row > 7 || col < 0 || col > 7) 
    {
         throw new IllegalArgumentException("Invalid position: must be between 0 and 7.");
    }
        this.row = row;
        this.col = col;
    }
    
    public int getRow() 
    {
        return row;
    }
    
    public int getCol() 
    {
        return col;
    }
    
    public boolean equals(Position other) 
    {
        return this.row == other.getRow() && this.col == other.getCol();
    }
}  
