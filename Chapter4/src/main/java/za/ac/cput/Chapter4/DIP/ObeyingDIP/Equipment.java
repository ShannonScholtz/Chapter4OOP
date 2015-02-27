package za.ac.cput.Chapter4.DIP.ObeyingDIP;

/**
 * Created by student on 2015/02/27.
 */
public class Equipment implements MotorCyclistEquipment{

    private final double helmet = 2500.00;
    private final double gloves = 150.00;
    private final double jacket = 850.00;
    private final double pants = 750.00;

    public double getHelmet() {
        return helmet;
    }

    public double getGloves() {
        return gloves;
    }

    public double getJacket() {
        return jacket;
    }

    public double getPants() {
        return pants;
    }

    @Override
    public double helmet(int quantity){
        return quantity * getHelmet();
    }

    @Override
    public double gloves(int quantity) {
        return quantity * getGloves();
    }

    @Override
    public double jacket(int quantity) {
        return quantity * getJacket();
    }

    @Override
    public double pants(int quantity)
    {
        return quantity * getPants();
    }

    public void EnteringPurchase()
    {
        System.out.println("purchasing motorcycle accessory....");
        System.out.println("Motorcycle accessory purchased");
    }
}
