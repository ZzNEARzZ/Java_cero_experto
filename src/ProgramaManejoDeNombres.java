import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese nombre_1");
        String nombre_1=scanner.nextLine();
        String nom_1 = nombre_1.toUpperCase().charAt(1)+"."+nombre_1.substring(nombre_1.length()-2);
        System.out.println("Ingrese nombre_2");
        String nombre_2=scanner.nextLine();
        String nom_2 = nombre_2.toUpperCase().charAt(1)+"."+nombre_2.substring(nombre_2.length()-2);
        System.out.println("Ingrese nombre_3");
        String nombre_3=scanner.nextLine();
        String nom_3 = nombre_3.toUpperCase().charAt(1)+"."+nombre_3.substring(nombre_3.length()-2);
        System.out.println(nom_1+"_"+nom_2+"_"+nom_3);
    }
}
