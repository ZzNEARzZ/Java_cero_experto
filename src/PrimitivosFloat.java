public class PrimitivosFloat {
     static float varFlotante;

    public static void main(String[] args) {
        float realFloat = 0.00000000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo Float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo Float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un Float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un Float: " + Float.MIN_VALUE);

        double realDouble=3.4828235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo Double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo Double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo de un Double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un Double: " + Double.MIN_VALUE);

        //float varFlotante
        float varFlotante=3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
