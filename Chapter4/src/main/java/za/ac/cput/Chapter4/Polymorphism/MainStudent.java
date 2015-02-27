package za.ac.cput.Chapter4.Polymorphism;

/**
 * Created by student on 2015/02/26.
 */
public class MainStudent {

    public static void main(String args[])
    {
        Student stud = new Student();
        System.out.print(stud.job());

        Student j = new StudentJob();

        System.out.print(j.job());

    }
}
