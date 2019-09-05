import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        this.fibonacci = new Fibonacci();
    }

    @Test
    public void testKnowFibonacciValues() {
        int[] fib  = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
        for (int i=0; i<fib.length; i++) {
            BigInteger expected = BigInteger.valueOf(fib[i]);
            System.out.print("Expected: " + fib[i]);
            BigInteger actual = this.fibonacci.fib(i+1, false);
            System.out.print(" Actual: " + actual + "\n");
            assertEquals(expected, actual);
        }
    }
}