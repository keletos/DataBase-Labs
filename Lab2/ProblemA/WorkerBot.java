package Lab2.ProblemA;

import java.util.Objects;

public class WorkerBot extends Bot{
    private String instrumentary;

    public WorkerBot(String newSerialDesignation, String newSpecialization, String newInstrumentary)
    {
        super(newSerialDesignation, newSpecialization);
        this.instrumentary = newInstrumentary;
    }

    public String getInstrumentary()
    {
        return instrumentary;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (!super.equals(obj)) 
        {
            return false;
        }

        WorkerBot that = (WorkerBot) obj;
        return Objects.equals(instrumentary, that.instrumentary);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(super.hashCode(), instrumentary);
    }

    @Override
    public String toString() 
    {
        return "AdvancedRobot{Serial number ='" + getSerialNumber() + "', specialization=" + getSpecialization() + ", instrumentary='" + getInstrumentary() + "'}";
    }
}
