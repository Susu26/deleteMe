package at.ac.htl.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void whenGetSumThenResultIs385() {
        var app = new App();
        assertEquals(385, app.getSum());
    }
}
