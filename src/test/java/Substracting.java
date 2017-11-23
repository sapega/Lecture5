import com.playtika.calculator.Operations;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Substracting {
    @Test(priority = 1)
    public class Test1 {
        public void simpleCheck() {
            Operations operations = new Operations(5, 2);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not 3", result == 3);
        }
    }

    @Test(priority = 1)
    public class Test2 {
        public void simpleCheck2() {
            Operations operations = new Operations(4, 0);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not 4", result == 4);
        }
    }

    @Test(priority = 1)
    public class Test3 {
        public void simpleCheck3() {
            Operations operations = new Operations(-3, -3);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not 0", result == 0);
        }
    }

    @Test(priority = 1)
    public class Test4 {
        public void simpleCheck4() {
            Operations operations = new Operations(40, -40);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not 0", result == 80);
        }
    }


    @Test(priority = 1)
    public class Test5 {
        public void simpleCheck5() {
            Operations operations = new Operations(14000, 4000);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not 10000", result == 10000);
        }
    }

    @Test(priority = 1)
    public class Test6 {
        public void simpleCheck6() {
            Operations operations = new Operations(5, 7);
            double result = operations.subtract();
            assertTrue("Result " + result + " is not -2", result == -2);
        }
    }
}
