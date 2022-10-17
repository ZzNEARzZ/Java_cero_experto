public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String travalenguas="travalenguas";
        System.out.println("travalenguas.length() = " + travalenguas.length());
        System.out.println("travalenguas.toCharArray() = " + travalenguas.toCharArray());

        char [] arreglo = travalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i=0;i<largo;i++){
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntravalenguas.split(\"a\") = " + travalenguas.split("a"));  //la funcion split separa de acuerdo al caracter.
        String[] arreglo2=travalenguas.split("a");
        int l = arreglo2.length;
        for (int j=0;j<l;j++){
            System.out.println(arreglo2[j]);
        }
        String archivo= "alguna.imagen.jpg";
        String[] archivoArr = archivo.split("\\."); // si es caracter especial es doble \ o tabien corchetes
        l=archivoArr.length;
        System.out.println("l = " + l);
        for (int j=0;j<l;j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);



    }
}
