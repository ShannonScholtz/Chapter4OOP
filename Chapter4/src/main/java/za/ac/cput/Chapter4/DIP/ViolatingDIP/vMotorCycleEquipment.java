package za.ac.cput.Chapter4.DIP.ViolatingDIP;

/**
 * Created by student on 2015/02/27.
 */
public class vMotorCycleEquipment implements vPurchase{
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


    public double helmet(int quantity){
        return quantity * getHelmet();
    }


    public double gloves(int quantity) {
        return quantity * getGloves();
    }


    public double jacket(int quantity) {
        return quantity * getJacket();
    }


    public double pants(int quantity)
    {
        return quantity * getPants();
    }

    @Override
    public void EnteringPurchase()
    {
        System.out.println("purchasing motorcycle accessory....");
        System.out.println("Motorcycle accessory purchased");
    }
}
