package za.ac.cput.sanele;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestTruth
{
    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testName() throws Exception
    {
        Truth t = new Truth();
        //String expected = "Cobol";
        String result = t.isTrueStr("Cobol");
        boolean bool = false;

        if(result == "Cobol")
        {
            bool = true;
        }
        else
        {
            bool = false;
        }
        Assert.assertTrue( bool );
    }
}
