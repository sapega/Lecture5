import com.playtika.calculator.Operations;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

//Set priority for training as well as the the same method name

public class Dividing {
    @Test(priority = 1)
    public class Test1 {
        public void simpleCheck() {
            Operations operations = new Operations(10, 5);
            double result = operations.divide();
            assertTrue("Result " + result + " is not 2", result == 2);
        }
    }

    @Test(priority = 1)
    public class Test2 {
        public void simpleCheck2() {
            Operations operations = new Operations(15, -3);
            double result = operations.divide();
            assertTrue("Result " + result + " is not -5", result == -5);
        }
    }

    @Test(priority = 1)
    public class Test3 {
        public void simpleCheck3() {
            Operations operations = new Operations(-50, -10);
            double result = operations.divide();
            assertTrue("Result " + result + " is not 5", result == 5);
        }
    }

    @Test(priority = 1)
    public class Test4 {
        public void simpleCheck4() {
            Operations operations = new Operations(3, 2);
            double result = operations.divide();
            assertTrue("Result " + result + " is not 1.5", result == 1.5);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void simpleCheck5() {
        Operations operations = new Operations(3, 0);
        double result = operations.divide();

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void simpleCheck6() {
        Operations operations = new Operations(0, 4);
        double result = operations.divide();

    }

}
