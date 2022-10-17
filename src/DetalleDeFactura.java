import java.util.InputMismatchException;
import java.util.Scanner;


public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre de la factura");
        String nombreFactura = scanner.nextLine();
        double precio1=0;
        double precio2=0;
        double total;
        double impuesto;

       try {
            System.out.println("Ingrese Precio 1");
            precio1 = scanner.nextDouble();
            System.out.println("Ingrese Precio 2");
            precio2 = scanner.nextDouble();

        }catch (InputMismatchException e){
           System.out.println("Error debe Ingresar un numero");
           main(args);
           System.exit(0);
        }
       total= precio1+precio2;
       impuesto=total*0.19;

       String nombreFactur = "La factura producto de "+ nombreFactura;
       String mensajeTotal=" tiene un total bruto de "+ total;
       String mensajeImpuesto=", con un impuesto de "+impuesto;
       String mensajeImpu= " y el monto después de impuesto es de "+ (impuesto+total);

       String mensaje=nombreFactur+mensajeTotal+mensajeImpuesto+mensajeImpu;
        System.out.println(mensaje);
    }
}
