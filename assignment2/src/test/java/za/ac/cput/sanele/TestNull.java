package za.ac.cput.sanele;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestNull
{
    @Before
    public void setUp() throws Exception
    { }

    @Test
    public void testNull() throws Exception
    {
        Null n = new Null();
        Assert.assertNull(n.info());
    }
}
