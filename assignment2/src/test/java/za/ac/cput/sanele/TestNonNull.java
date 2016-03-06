package za.ac.cput.sanele;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestNonNull
{
    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testNonNull() throws Exception
    {
        NonNull nonNul = new NonNull();
        Assert.assertNotNull(nonNul.info());
    }
}
