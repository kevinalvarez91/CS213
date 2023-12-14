

public class Exercise_1 {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);

        int fib_num = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + fib_num);


    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
