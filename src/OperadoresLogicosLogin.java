import java.security.KeyStore;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12356";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("Ingrese el password");

        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0 ; i < usernames.length;i++ ){
            esAutenticado= (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;

            /*if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
        }

         String mensaje = esAutenticado? "Biuenvenido usuario ".concat(u).concat("!"):
                 "Username o contraseña incorrecto!\nLo sentimos, requiere autentificacion";

        System.out.println("mensaje = " + mensaje);


        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Username o contraseña incorrecto");
            System.out.println("Lo siento, requiere autentificacion");
        }*/
    }
}
