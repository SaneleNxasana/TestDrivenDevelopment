package za.ac.cput.sanele;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestObjectIdentity
{

    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testName() throws Exception
    {
        ObjectIdentity objId1 = new ObjectIdentity();
        ObjectIdentity objId2 = objId1;

        Assert.assertSame(objId1, objId2);
        System.out.println("Objects point to the same memory location, making them identical");
    }
}
