package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.Polymorphism.Student;
import za.ac.cput.Chapter4.config.AppConfig;

/**
 * Created by student on 2015/02/26.
 */
public class testPolymorphism {

    private ApplicationContext ctx;
    private Student st;


    @Before
    public void setUp() throws Exception {

       ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        st = (Student)ctx.getBean("poly");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testJob()
    {
       // st.job();
        Assert.assertEquals("You truly are great at your job sir", st.job());
    }
}
