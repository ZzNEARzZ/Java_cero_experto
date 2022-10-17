import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Primer Numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese Segundo Numero");
        int b = scanner.nextInt();
       if (a>b){
           System.out.println("Los Numeros ordenados son: "+a+" "+b );
       }else{
           System.out.println("Los Numeros ordenados son: "+b+" "+a );
       }*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);
    }
}
