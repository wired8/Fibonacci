import java.math.*;

public class Fibonacci
{
    public Fibonacci()
    {
    }

    public BigInteger fib(int n, boolean print)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(0);
        BigInteger c = BigInteger.valueOf(1);
        for (int i=1; i<=n; ++i) {
            a = b;
            b = c;
            c = a.add(b);
            if (print) System.out.print(a+" ");
        }
        return a;
    }
}