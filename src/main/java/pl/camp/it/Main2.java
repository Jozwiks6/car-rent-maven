package pl.camp.it;

public class Main2 {
    public static void main(String[] args) {
        //Random random   =   new Random();
        //System.out.println(random.nextInt());
        //System.out.println(random.nextInt(10));
        a();
    }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        int[] tablica = new int[5];
        tablica[5] = 0;
    }
}
