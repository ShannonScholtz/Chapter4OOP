package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vCentralDefender;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vFootballPlayer;
import za.ac.cput.Chapter4.LSP.ViolatingLSP.vGoalKeeper;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class testLSPViolate {

    private ApplicationContext ctx;
    private vFootballPlayer cd;
    private vFootballPlayer gk;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        gk= (vGoalKeeper)ctx.getBean("LSPVio2");
        cd = (vCentralDefender)ctx.getBean("LSPVio");

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testGK()
    {
        Boolean play = gk.dribbles() == true && gk.GoalKicks() == true && gk.Saves() == true;
        Assert.assertEquals(false, play);
    }

    @Test
    public void testCD()
    {
        Boolean play = cd.dribbles() == true && cd.GoalKicks() == true && cd.Saves() == true;
        Assert.assertEquals(true, play);
    }

}
