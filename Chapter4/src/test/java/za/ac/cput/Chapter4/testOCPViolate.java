package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.OCP.ObeyingOCP.StudentInfo;
import za.ac.cput.Chapter4.OCP.ViolatingOCP.vStudent;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class testOCPViolate {

    private ApplicationContext ctx;
    private vStudent vs;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        vs = (vStudent)ctx.getBean("OCPVio");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testFootballer()
    {
        Assert.assertEquals("Position is left wing", vs.FootballerPosition());
    }

    @Test
    public void testRugbyPlayer()
    {
        Assert.assertEquals("Position is Flanker", vs.RugbyPlayerPosition());
    }
}


