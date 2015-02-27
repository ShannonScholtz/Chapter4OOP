package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.Inheritance.CentralMidFielder;
import za.ac.cput.Chapter4.OCP.ObeyingOCP.StudentInfo;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class testOCPObey {

    private ApplicationContext ctx;
    private StudentInfo s;
    private StudentInfo s2;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        s = (StudentInfo)ctx.getBean("OCPObey");
        s2 = (StudentInfo)ctx.getBean("OCPObey2");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testFootballer()
    {
        Assert.assertEquals("Students position is left wing", s.Sport());
    }

    @Test
    public void testRugbyPlayer()
    {
        Assert.assertEquals("Student is a flanker", s2.Sport());
    }



}
