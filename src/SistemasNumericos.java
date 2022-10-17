import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroSTR = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal=0;
        try {
            numeroDecimal=Integer.parseInt(numeroSTR);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe Ingresar un numero");
            main(args);
            System.exit(0);
        }
        //int numeroDecimal=Integer.parseInt(numeroSTR);
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("Numero binario de = "+ numeroDecimal +" = "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal="Numero octal de = "+ numeroDecimal +" = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHex= "Numero Hexadecimal de = "+ numeroDecimal +" = "+Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex= 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje="numero binario de "+numeroDecimal+ " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
