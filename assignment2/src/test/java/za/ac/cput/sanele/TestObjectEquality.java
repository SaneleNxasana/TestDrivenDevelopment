package za.ac.cput.sanele;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestObjectEquality
{
    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testObject() throws Exception
    {
        ObjectEquality obj1 = new ObjectEquality("Sanele", "Nxasana", 23);
        ObjectEquality obj2 = new ObjectEquality("Sanele", "Nxasana", 23);
        Assert.assertEquals(obj1, obj2);
    }
}
