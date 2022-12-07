package ie.atu.exam;
public class Employee
{
    public String Name;
    public int Number;

    public Employee(String name, int number)
    {
        this.Name = name;
        this.Number = number;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        if(name.length() >= 5)
        {
            Name = name;
        }
        else
        {
            throw new IllegalArgumentException("Minimum of characters needed or else invalid name error");
        }

    }

    public int getNumber()
    {
        return Number;
    }

    public void setNumber(int number)
    {
        if(number == 12)
        {
            Number = number;
        }
        else
        {
            throw new IllegalArgumentException("Needs a unique 12 digit number, or else invalid employee number error");
        }
    }
}