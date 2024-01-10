import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.Romb;

public class RombTest {
    Romb romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Romb();
    }
    @Test
    public void testArgumentType(){
        String doubleString = "Double";
        String doubleTest = "";
        Number result = this.romb.calcArea(10.0,90.0);
        if (result instanceof Double) {
            doubleTest = "Double";
        }
        Assert.assertEquals(doubleString, doubleTest);
    }

    @Test
    public void testCalcArea_Side10_Alpha90(){
        Double result = this.romb.calcArea(10.0,90.0);
        Double expected = 100.0;
        Assert.assertEquals(result, expected, 0.1);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalcArea_Side0_Alpha0(){
        this.romb.calcArea(0.0, 0.0);
    }
}
