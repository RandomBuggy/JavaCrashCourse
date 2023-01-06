public class ClassAndObject {
    String name;
    int p;
    public ClassAndObject(char a, int b, String name) {
        p = a;
        this.name = name;
        System.out.println(p);
    }
    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject('a', 'a', "The String Argument");
        obj.customMethod((char)97, 65);
        obj.customMethod((char)97, 'A');
    }
    public void customMethod(char a, int b) {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

