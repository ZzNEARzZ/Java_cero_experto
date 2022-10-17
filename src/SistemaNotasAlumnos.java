import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double nota;
        int contadorMayores5=0;
        int contadorMenores4=0;
        int contarNotas1=0;
        double suma5=0,suma4=0,sumaTotal=0;
        notas:
        for (int i=0;i<20;i++){
            System.out.println("Ingrese la Nota "+(i+1)+" en una escala del 1 - 7:");
            nota=scanner.nextDouble();
            if (nota>7||nota<1){
                System.out.println("error finalizando el programa.");
                break notas;
            }
            if (nota==1){
                contarNotas1++;
            }else{
                if (nota>5){
                    contadorMayores5++;
                    suma5+=nota;
                } else if (nota<4) {
                    contadorMenores4++;
                    suma4+=nota;
                }
            }
            sumaTotal+=nota;
        }
        System.out.println("El número de notas 1 es de: " + contarNotas1);

        if (contadorMayores5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            suma5 = suma5 / contadorMayores5;
            System.out.println("Promedio de notas mayores a 5: " + suma5);
        }

        // trabajamos con las notas inferiores a 4
        if (contadorMenores4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            suma4 = suma4 / contadorMenores4;
            System.out.println("Promedio de notas menores a 4: " + suma4);
        }
        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
