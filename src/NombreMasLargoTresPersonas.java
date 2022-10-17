import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargoTresPersonas {
    public static void main(String[] args) {

        String nomb1 = JOptionPane.showInputDialog("Ingresa el Primer nombre y apellido:");
        String nomb2 = JOptionPane.showInputDialog("Ingresa el Segundo nombre y apellido:");
        String nomb3 = JOptionPane.showInputDialog("Ingresa el Tercer nombre y apellido:");

        String max= (nomb1.split(" ")[0].length() < nomb2.split(" ")[0].length())? nomb2 : nomb1;
        max = (nomb3.split(" ")[0].length() < max.split(" ")[0].length())? max:nomb3;

        System.out.println("EL nombre mas Largo es: "+ max);
    }
}
