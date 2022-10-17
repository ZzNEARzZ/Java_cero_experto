public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre="Andres";
        System.out.println("nombre.length = " + nombre.length()); // Tamaño de string
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // vuelve mayuscula al string
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // vuelve minuscula al string
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); // Compara String con el valor ingresado
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres")); // Compara String con el valor ingresado
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); //Compara el stroing pero a su vez ignora si es mayuscula o muniscula
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); //compara si son iguales en caso sea asi vota 0
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); //compara si son iguales en caso sea asi vota 0 en caso que on sean iguales vota un negativo o numero par
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));


        String travalenguas="travalenguas";
        System.out.println("travalenguas.replace(\"a\",\".\") = " + travalenguas.replace("a","."));
        System.out.println("travalenguas = " + travalenguas);
        System.out.println("travalenguas.indexOf('a') = " + travalenguas.indexOf('a'));
        System.out.println("travalenguas.lastIndexOf('a') = " + travalenguas.lastIndexOf('a'));
        System.out.println("travalenguas.indexOf(\"lenguas\") = " + travalenguas.indexOf("lenguas"));
        System.out.println("travalenguas.contains(\"lenguas\") = " + travalenguas.contains("lenguas"));
        System.out.println("travalenguas.startsWith(\"tr\") = " + travalenguas.startsWith("tr"));
        System.out.println("travalenguas.endsWith(\"as\") = " + travalenguas.endsWith("as"));

        System.out.println(" trabalenguas ");
        System.out.println("trabalenguas".trim());
    }
}
