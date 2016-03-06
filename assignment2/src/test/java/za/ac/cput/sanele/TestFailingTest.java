package za.ac.cput.sanele;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestFailingTest
{
    @Before
    public void setUp() throws Exception
    {   }

    @Test
    public void testFail() throws Exception
    {
        FailingTest fTest = new FailingTest();
        Assert.assertNotSame(fTest.failTest());
    }
}
