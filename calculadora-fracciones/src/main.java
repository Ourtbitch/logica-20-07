import java.util.Scanner;

public class main {
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
        
        System.out.println("Ingrese el denominador 2");
        d2 = cb.nextInt();
        while (d2==0) {
            System.out.println("Ingrese un valor distinto de 0 ");
            d2 = cb.nextInt();
        }
        System.out.println("Ingrese el numerador 2");
        n2 = cb.nextInt();
        Fraccion f1 = new Fraccion(n1, d1);
        Fraccion f2 = new Fraccion(n2, d2);

        System.out.println("Suma: " + sumar(f1, f2));
        System.out.println("Resta: " + restar(f1, f2));
        System.out.println("Multiplicación: " + multiplicar(f1, f2));
        System.out.println("División: " + dividir(f1, f2));
        
        
    }
    public static Fraccion sumar(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public static Fraccion restar(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public static Fraccion multiplicar(Fraccion f1, Fraccion f2) {
        int numerador = f1.numerador * f2.numerador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public static Fraccion dividir(Fraccion f1, Fraccion f2) {
        int numerador = f1.numerador * f2.denominador;
        int denominador = f1.denominador * f2.numerador;
        return new Fraccion(numerador, denominador);
    }
}
