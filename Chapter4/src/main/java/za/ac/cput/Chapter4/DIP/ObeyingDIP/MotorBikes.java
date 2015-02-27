package za.ac.cput.Chapter4.DIP.ObeyingDIP;

/**
 * Created by student on 2015/02/27.
 */
public class MotorBikes implements MotorCycleModels {



    private final double kawa = 3500;
    private final double honda = 9000;
    private final double duca = 50000;



    public double getKawa() {
        return kawa;
    }

    public double getHonda() {
        return honda;
    }

    public double getDuca() {
        return duca;
    }





    @Override
    public double Kawasaki(int quantity)
    {
        return quantity * getKawa();
    }

    @Override
    public double Honda(int quantity)
    {
        return quantity * getHonda();

    }

    @Override
    public double Ducati(int quantity)
    {
       return quantity * getDuca();
    }

    public void EnteringPurchase()
    {
        System.out.println("purchasing motorcycles....");
        System.out.println("Bikes purchased");
    }
}
