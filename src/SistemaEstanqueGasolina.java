import java.util.Scanner;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double tanque;

        System.out.println("Ingrese la capacidad actualñ del tanque maximo 70 litros: ");

        tanque=scanner.nextDouble();
        if(tanque>=0 && tanque<20){
            System.out.println("Insuficiente");
        } else if (tanque>=20 && tanque<35) {
            System.out.println("Suficiente");
        } else if (tanque>=35 && tanque<40) {
            System.out.println("Medio Estanque");
        } else if (tanque>=40 && tanque<60) {
            System.out.println("Estanque 3/4");
        } else if (tanque>=60 && tanque<70) {
            System.out.println("Estaque casi lleno");
        } else if (tanque==70) {
            System.out.println("Estque lleno");
        }
    }
}
