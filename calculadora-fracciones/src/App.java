import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int d1,d2,n1,n2;
        Scanner cb = new Scanner(System.in);
        System.out.println("Ingrese el denominador 1");
        d1 = cb.nextInt();
        while (d1==0) {
            System.out.println("Ingrese un valor distinto de 0 ");
            d1 = cb.nextInt();
        }
        System.out.println("Ingrese el numerador 1");
        n1 = cb.nextInt();
        while (n1==0) {
            System.out.println("Ingrese un valor distinto de 0 ");
            n1 = cb.nextInt();
        }
        System.out.println("Ingrese el denominador 2");
        d2 = cb.nextInt();
        while (d2==0) {
            System.out.println("Ingrese un valor distinto de 0 ");
            d2 = cb.nextInt();
        }
        System.out.println("Ingrese el numerador 2");
        n2 = cb.nextInt();
        while (n2==0) {
            System.out.println("Ingrese un valor distinto de 0 ");
            n2 = cb.nextInt();
        }
        
    }
}
