package Lab2.ProblemA;

import java.util.Objects;

public class DissasemblyBot extends Bot{
    private String weaponry;

    public DissasemblyBot(String newSerialDesignation, String newSpecialization, String newWeaponry)
    {
        super(newSerialDesignation, newSpecialization);
        this.weaponry = newWeaponry;
    }

    public String getWeaponary()
    {
        return weaponry;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (!super.equals(obj)) 
        {
            return false;
        }

        DissasemblyBot that = (DissasemblyBot) obj;
        return Objects.equals(weaponry, that.weaponry);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(super.hashCode(), weaponry);
    }

    @Override
    public String toString() 
    {
        return "AdvancedRobot{Serial number ='" + getSerialNumber() + "', specialization=" + getSpecialization() + ", weaponry='" + getWeaponary() + "'}";
    }
}
