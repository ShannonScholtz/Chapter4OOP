package za.ac.cput.Chapter4.LSP.ViolatingLSP;

/**
 * Created by student on 2015/02/27.
 */
public class vGoalKeeper implements vFootballPlayer {

    @Override
    public Boolean dribbles()
    {
        return true;
    }

    @Override
    public Boolean Saves()
    {
        return true;
    }

    @Override
    public Boolean GoalKicks()
    {
        return false;
    }
}
