import org.testng.annotations.BeforeTest;

import com.example.Romb;

public class RombTest {
    Romb romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Romb();
    }
}
