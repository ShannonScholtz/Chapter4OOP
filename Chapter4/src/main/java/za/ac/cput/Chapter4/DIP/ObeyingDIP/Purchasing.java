package za.ac.cput.Chapter4.DIP.ObeyingDIP;

import java.util.Scanner;

/**
 * Created by student on 2015/02/27.
 */
public class Purchasing {

    public Purchasing()
    {
        Equipment equip = new Equipment();
        MotorBikes mbm = new MotorBikes();

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the option below:");
        System.out.println("Enter 1 for motorcycle gear or 2 for motorcycle purchase:");
        int option = input.nextInt();

        if (option == 1)
        {
            equip.EnteringPurchase();
        } else
        {
            mbm.EnteringPurchase();
        }
    }
}
