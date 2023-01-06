public class defaultValue {
    byte h;
    char i;
    short j;
    long k;
    int a;
    float b;
    boolean c;
    double g;
    static double l;
    public static void main(String[] args) {
        int d;
        float e;
        float f;
        /* local variables have no default values */
        defaultValue obj = new defaultValue();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.g);
        System.out.println(obj.h);
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);
        System.out.println(l);
        System.out.println(defaultValue.l);
        /*System.out.println(d);
        System.out.println(e);
        System.out.println(f);*/
    }
}

