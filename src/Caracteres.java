public class Caracteres {
    public static void main(String[] args) {
        char caracter='\u0040';
        char decimal=64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + decimal);

        System.out.println("decimal = caracter = " + (decimal == caracter));

        char simbolo ='0';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo==caracter));

        char espacio='\u0020';
        char retroceso='\b';
        char tabulador='\t';
        char nuevaLinea='\n';
        char retornoCarro='\u0020';

        System.out.println("tipo Char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo Char corresponde en bites a " + Character.SIZE);
        System.out.println("valor máximo de un Char: " + Character.MAX_VALUE);
        System.out.println("valor minimo de un Char: " + Character.MIN_VALUE);
    }
}
