package za.ac.cput.Chapter4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.Encapsulation.SoccerPlayerInformation;
import za.ac.cput.Chapter4.config.AppConfig;


/**
 * Created by student on 2015/02/26.
 */
public class testEncapsulation {

    private ApplicationContext ctx;
    private SoccerPlayerInformation spi;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        spi = (SoccerPlayerInformation)ctx.getBean("Encap");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testName()
    {
        spi.setName("Shannon");
        Assert.assertEquals("Shannon", spi.getName());
    }

    @Test
    public void testAge()
    {
       spi.setAge(2);
        Assert.assertEquals(2, spi.getAge());
    }

    @Test
    public void testPosition()
    {
        spi.setPosition("Left Back");
        Assert.assertEquals("Left Back", spi.getPosition());
    }


}
