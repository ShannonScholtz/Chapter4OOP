package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.CentralDefender;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.FootballPlayer;
import za.ac.cput.Chapter4.LSP.ObeyingLSP.GoalKeeper;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class testLSPObey {

    private ApplicationContext ctx;
    private FootballPlayer cd;
    private FootballPlayer gk;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        gk= (GoalKeeper)ctx.getBean("LSPObey2");
        cd = (CentralDefender)ctx.getBean("LSPObey");

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testGK()
    {
        Boolean play = gk.dribbles() == true && gk.GoalKicks() == true && gk.Saves() == true;
        Assert.assertEquals(true, play);
    }

    @Test
    public void testCD()
    {
        Boolean play = cd.dribbles() == true && cd.GoalKicks() == true && cd.Saves() == true;
        Assert.assertEquals(true, play);
    }
}

