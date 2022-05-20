import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOperations {

    @Test
    public void checkSumm(){
        Assert.assertTrue(summ(2,3) == 5);
        Assert.assertTrue(summ(2,4) == 6);

    }

    @Test
    public void checkMult(){
        Assert.assertTrue(mult(4,5) == 20);
        Assert.assertTrue(mult(6,5) == 30);
    }
    public int summ(int a, int b){
        return a + b;
    }
    
    public int mult(int a, int b){
        return a * b;
    }


}
