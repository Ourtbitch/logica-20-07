public class Cadenas {
    /*Problema: Escribe una función que reciba una cadena de texto
     y devuelva el número de palabras que tienen más de 3 caracteres
      y que no contengan ninguna vocal.
    Ejemplo: Para la cadena "brrr grrrt text hello", la función debería 
    devolver 2, ya que "brrr" y "grrrt" son las únicas palabras que 
    cumplen con las condiciones. */

    private String texto;

    public Cadenas(String texto) {
        this.texto=texto;
    }

    private int contarPalabrasValidas(){
        String[] palabras = texto.split("//s+");
        int conteo = 0;
        for (String palabra : palabras) {
            if (esPalabraValida(palabra)) {
                conteo++;
            }
        }
        return conteo;
    }
    private boolean esPalabraValida(String palabra){
        if (palabra.length() <=3) {
            return false;
        }
        for (char c : palabra.toCharArray()) {
            if (esVocal(c)) {
                return false;
            }
        }
        return true;
    }
    private boolean esVocal(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
