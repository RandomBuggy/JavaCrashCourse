import java.util.Scanner;
import java.util.ArrayList;

public class ArrayNonPremitive extends Object {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4,5};
        System.out.println(array.length);

        for (int item : array) {
            System.out.println(item);
        }

        String[] Array = new String[2];
        try {
            for (int i = 0; i < array.length; i++) {
                Array[i] = new Scanner(System.in).next();
            }
        }
        catch (Exception e) {
            System.out.println();
        }
        for (String item : Array) {
            System.out.println(item);
        }

        if (Array[0] instanceof String) {
            System.out.println("String instance");
        }
        if(Array[0] instanceof Object) {
            System.out.println("Object instance");
        }
        ArrayList<Integer> list = new ArrayList<>();
        SavingAccount sa1 = new SavingAccount("saving", "union", "876554554566", 5000, 7);
        SavingAccount sa2 = new SavingAccount("saving", "common", "775545345676", 10000, 10);
        SavingAccount sa3 = new SavingAccount("saving", "intersection", "47477549428228", 2000, 5);
        ArrayList<SavingAccount> accounts = new ArrayList<>();
        accounts.add(sa1);
        accounts.add(sa2);
        accounts.add(sa3);
        System.out.println(accounts.size());
        System.out.println(accounts.indexOf(sa3));
        System.out.println(accounts.get(0).type);
        System.out.println(accounts.get(0).name);
        System.out.println(accounts.get(0).number);
        System.out.println(accounts.get(accounts.indexOf(sa2)).amount);
        System.out.println(accounts.contains(null));
        System.out.println(accounts.contains(sa3));
    }
}

