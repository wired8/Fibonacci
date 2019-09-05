import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Sequence of " + n + " " + "is:");
        fibonacci.fib(n, true);

    }
}
