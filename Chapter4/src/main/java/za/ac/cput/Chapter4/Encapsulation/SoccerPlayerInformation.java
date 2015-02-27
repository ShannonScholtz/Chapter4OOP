package za.ac.cput.Chapter4.Encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class SoccerPlayerInformation {

    private String Name;
    private int Age;
    private String Position;


    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;

    }

    public String getPosition()
    {
        return Position;
    }

    public void setPosition(String pos)
    {
        Position = pos;
    }
}
