package za.ac.cput.Chapter4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter4.ISP.ObeyingISP.AStudent;
import za.ac.cput.Chapter4.ISP.ObeyingISP.BestExamResults;

/**
 * Created by student on 2015/02/27.
 */
public class testISPObey {

    private ApplicationContext ctx;
    private BestExamResults exam;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        exam= (AStudent)ctx.getBean("ISPObey");


    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testGK()
    {
       // Boolean results = exam.leader() == true && exam. == true && gk.Saves() == true;
        //Assert.assertEquals(true, results);
    }


}
