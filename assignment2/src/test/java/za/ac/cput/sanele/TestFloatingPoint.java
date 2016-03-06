package za.ac.cput.sanele;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2016/03/04.
 */
public class TestFloatingPoint
{
    @Before
    public void before()
    {    }


    @Test
    public void testFloatingPoint()
    {
        System.out.println("Floating point test");

        FloatingPoint test = new FloatingPoint();
        assertEquals(8.0, test.floatingPoint(4.2f, 4.6f), 1);
    }

    @After
    public void after()
    {    }
}
