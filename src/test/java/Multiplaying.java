import com.playtika.calculator.Operations;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Multiplaying {
    @Test(priority = 1)
    public class Test1 {
        public void simpleCheck() {
            Operations operations = new Operations(5, 5);
            double result = operations.multiply();
            assertTrue("Result " + result + " is not 25", result == 25);
        }
    }

    @Test(priority = 1)
    public class Test2 {
        public void simpleCheck2() {
            Operations operations = new Operations(10, 0);
            double result = operations.multiply();
            assertTrue("Result " + result + " is not 0", result == 0);
        }
    }

    @Test(priority = 1)
    public class Test3 {
        public void simpleCheck3() {
            Operations operations = new Operations(-30, 5);
            double result = operations.multiply();
            assertTrue("Result " + result + " is not -150", result == -150);
        }
    }

    @Test(priority = 1)
    public class Test4 {
        public void simpleCheck4() {
            Operations operations = new Operations(150, 1000);
            double result = operations.multiply();
            assertTrue("Result " + result + " is not 150000", result == 150000);
        }
    }


    @Test(priority = 1)
    public class Test5 {
        public void simpleCheck5() {
            Operations operations = new Operations(-50, -50);
            double result = operations.multiply();
            assertTrue("Result " + result + " is not 2500", result == 2500);
        }
    }

}
