package za.ac.cput.sanele;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestInteger
{
    @Before
    public void before()
    {}

    @Test

    public void testInteger()
    {
        System.out.println("Integer test");

        Integer test = new Integer();
        Assert.assertEquals(25, test.add(5, 5, 15),1);

    }

    @After
    public void after()
    {

    }
}
