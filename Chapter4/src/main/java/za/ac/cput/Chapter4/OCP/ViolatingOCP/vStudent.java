package za.ac.cput.Chapter4.OCP.ViolatingOCP;

/**
 * Created by student on 2015/02/26.
 */
public class vStudent {

    int SportType;

    String sportPosition;

    public  String Sport()
    {
        if(SportType == 1)
            sportPosition = FootballerPosition();
        else if (SportType == 2)
            sportPosition= RugbyPlayerPosition();

        return sportPosition;
    }

    public String FootballerPosition()
    {
        return "Position is left wing";
    }

    public String RugbyPlayerPosition()
    {
        return "Position is Flanker";
    }
}
