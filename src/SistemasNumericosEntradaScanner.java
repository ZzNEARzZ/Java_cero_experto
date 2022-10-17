import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroSTR = scanner.nextLine();
        int numeroDecimal=0;
        try {
            numeroDecimal= scanner.nextInt();//Integer.parseInt(numeroSTR);
        } catch (InputMismatchException e){
            System.out.println("Error debe Ingresar un numero");
            main(args);
            System.exit(0);
        }
        //int numeroDecimal=Integer.parseInt(numeroSTR);
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario= "Numero binario de = "+ numeroDecimal +" = "+Integer.toBinaryString(numeroDecimal);

        String resultadoOctal="Numero octal de = "+ numeroDecimal +" = "+Integer.toOctalString(numeroDecimal);

        String resultadoHex= "Numero Hexadecimal de = "+ numeroDecimal +" = "+Integer.toHexString(numeroDecimal);


        String mensaje=resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);


    }
}
