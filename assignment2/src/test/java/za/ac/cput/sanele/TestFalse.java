package za.ac.cput.sanele;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by NXA-C.unltd on 2016/03/06.
 */
public class TestFalse
{
    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testName() throws Exception
    {
        False f = new False();

        String result = f.isFalseStr("Nxasana");
        boolean bool = true;

        if(result == "Nxasana")
        {
            bool = false;
        }else{
            bool = true;
        }
        Assert.assertFalse( bool );
    }
}
