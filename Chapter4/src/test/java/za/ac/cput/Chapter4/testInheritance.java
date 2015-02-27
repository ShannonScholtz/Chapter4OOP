package za.ac.cput.Chapter4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.Inheritance.CentralMidFielder;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/26.
 */
public class testInheritance {

  //  CentralMidFielder sp = new CentralMidFielder();\
    private ApplicationContext ctx;
    private CentralMidFielder sp;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        sp = (CentralMidFielder)ctx.getBean("inherit");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testPassInheritance()
    {
        Assert.assertEquals("pass", sp.pass());
    }

    @Test
    public void testTacklesInheritance()
    {
        Assert.assertEquals("Tackles", sp.tackle());
    }

    @Test
    public void testScoresInheritance()
    {
        Assert.assertEquals("Scores", sp.score());
    }

    @Test
    public void testSkillInheritance()
    {
        Assert.assertEquals("Skills a player", sp.skills());
    }


}
