package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.Equipment;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorBikes;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorCycleModels;
import za.ac.cput.Chapter4.DIP.ObeyingDIP.MotorCyclistEquipment;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class testDIPObey {

    private ApplicationContext ctx;
    private MotorCyclistEquipment mce;
    private MotorCycleModels mcm;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mcm = (MotorBikes)ctx.getBean("DIPObey");
        mce = (Equipment)ctx.getBean("DIPObey2");

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testkawa()
    {
        double amount = mcm.Kawasaki(6);
        Assert.assertEquals(21000, amount, 5);
    }

    @Test
    public void testhonda()
    {
        double amount = mcm.Honda(3);
        Assert.assertEquals(27000, amount, 5);
    }

    @Test
    public void testDucati()
    {
        double amount = mcm.Ducati(2);
        Assert.assertEquals(100000, amount, 5);
    }

    @Test
    public void testHelmet()
    {
        double amount = mce.helmet(2);
        Assert.assertEquals(5000, amount, 5);
    }

    @Test
    public void testGloves()
    {
        double amount = mce.gloves(3);
        Assert.assertEquals(450, amount, 5);
    }

    @Test
    public void testJacket()
    {
        double amount = mce.jacket(1);
        Assert.assertEquals(850, amount, 5);
    }

    @Test
    public void testPants()
    {
        double amount = mce.pants(2);
        Assert.assertEquals(1500, amount, 5);
    }


    //@Test
   // public void testEquipment()
   // {
   //     Assert.assertEquals("Student is a flanker", s2.Sport());
   // }
}
