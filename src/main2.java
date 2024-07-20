import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int n;
        Scanner cb = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        n = cb.nextInt();
        for (int i = 1; i < n+1; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        cb.close();
    }
}
