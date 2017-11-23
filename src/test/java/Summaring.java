import com.playtika.calculator.Operations;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Summaring {
    @Test(priority = 1)
    public class Test1 {
        public void simpleCheck() {
            Operations operations = new Operations(2, 2);
            double result = operations.adding();
            assertTrue("Result " + result + " is not 4", result == 4);
        }
    }

    @Test(priority = 1)
    public class Test2 {
        public void simpleCheck2() {
            Operations operations = new Operations(0, 0);
            double result = operations.adding();
            assertTrue("Result " + result + " is not 0", result == 0);
        }
    }
    @Test(priority = 1)
    public class Test3 {
        public void simpleCheck3() {
            Operations operations = new Operations(-3, 3);
            double result = operations.adding();
            assertTrue("Result " + result + " is not 0", result == 0);
        }
    }

    @Test(priority = 1)
    public class Test4 {
        public void simpleCheck4() {
            Operations operations = new Operations(-50, -60);
            double result = operations.adding();
            assertTrue("Result " + result + " is not -110", result == -110);
        }
    }

    @Test(priority = 1)
    public class Test5 {
        public void simpleCheck5() {
            Operations operations = new Operations(6000, 4000);
            double result = operations.adding();
            assertTrue("Result " + result + " is not 10000", result == 10000);
        }
    }

}

