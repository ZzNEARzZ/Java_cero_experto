public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String c=a;
        StringBuilder sb = new StringBuilder(a);

       //System.out.println("c = " + c);
        long inicio = System.currentTimeMillis();
        for(int i=0; i<500;i++){
            //c=c.concat(a).concat(b).concat("\n");//500=>2ms, 1000=>4ms, 10000=>105ms, 100000=>5071
            //c += a+b+"\n"; //500=>19, 1000=>21ms, 10000=>68, 100000=>1976
            sb.append(a).append(b).append("\n"); // 500=>0ms, 1000=>0, 10000=>2ms,100000=>8ms


        }

        long fin=System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());



    }
}
