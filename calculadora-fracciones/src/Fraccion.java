public class Fraccion {
    public int numerador;
    public int denominador;
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void simplificar(){
        int gcd = gcd(numerador,denominador);
        numerador /= gcd;
        denominador /=gcd;
    }
    public int gcd(int a , int b){
        if (b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
    @Override
    public String toString() {
       
        return numerador+ "/"+denominador;  
    }
   
}

