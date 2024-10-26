package Lab2.ProblemA;

import java.util.Objects;

public abstract class Bot 
{
    private String serialDesignation;
    private String specialization;

    public Bot(String newSerialNumber, String newSpecialization)
    {
        this.serialDesignation = newSerialNumber;
        this.specialization = newSpecialization;
    }

    public String getSerialNumber()
    {
        return serialDesignation;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }

        Bot robot = (Bot) obj;

        return serialDesignation == robot.serialDesignation && Objects.equals(specialization, robot.specialization);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(serialDesignation, specialization);
    }

    @Override
    public String toString() 
    {
        return "Robot{Serial number ='" + serialDesignation + "', specialization=" + specialization + "}";
    }
}

