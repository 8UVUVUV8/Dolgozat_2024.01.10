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
    public void testCalcArea_Side10_Alpha20(){
        Double result = this.romb.calcArea(10.0,20.0);
        Double expected = 0.7660;
        Assert.assertEquals(result, expected, 0.1);
    }
}
