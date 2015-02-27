package za.ac.cput.Chapter4.ISP.ObeyingISP;

/**
 * Created by student on 2015/02/27.
 */
public class AStudent implements LeadershipQualities, ClassParticipation, BestAssignmentResults, BestExamResults {

    @Override
    public Boolean leader()
    {
        System.out.println("IS a great leader");
        return true;
    }

    @Override
    public Boolean participation()
    {
        System.out.println("Always participates");
        return true;
    }

    @Override
    public Boolean TopAssignments()
    {
        System.out.println("Always hands in top quality assignments");
        return true;
    }

    @Override
    public Boolean TopExamResult()
    {
        System.out.println("Has top exam results");
        return true;
    }
}
