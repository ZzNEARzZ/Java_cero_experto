import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres", "Pepe", "Maria", "Winny","JOse","Lol","Cesar","Zoely"};
        int count = nombres.length;
        for(int i=0;i<count;i++){
            if (nombres[i].equalsIgnoreCase("andres")||nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i+".- "+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i=0;i<count;i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar+ " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null,buscar+ " No existe en el sistema");
        }
    }
}
