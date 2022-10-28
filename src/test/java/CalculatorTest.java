import org.example.Calculations;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider(name = "factorial_data_provider")
    public Object[][] dpMethod() {
        return new Object [][] { {5,120}, {4,24},{0,1}, {-1,1},{10,10}};
    }

   @Test (dataProvider= "factorial_data_provider")
    public void testFactorial(int input, int expected) {
       Calculations calculator= new Calculations();
       Assert.assertEquals(calculator.factorial(input), expected);
   }


}
