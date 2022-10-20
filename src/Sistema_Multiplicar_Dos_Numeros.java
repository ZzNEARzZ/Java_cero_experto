import java.util.Scanner;

public class Sistema_Multiplicar_Dos_Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado=0;

        boolean positivoB=b>-1; //true
        boolean positivoA=a>-1; //false

        int absolutoA=positivoA? a : -a;

        for (int i=0;i<absolutoA;i++){
            resultado=resultado+b;
        }
        if ((!positivoA&&positivoB)||!positivoA){
            resultado=-resultado;
        }
        System.out.println("EL resultado es = " + resultado);
    }
}
