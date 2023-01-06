public class SavingAccount extends Account {
    public int charges;
    public String t;

    public SavingAccount(String type, String name, String number, int amount, int charges) {
        super(type, name, number, amount);
        this.charges = charges;
    }
    @Override
    public void withdraw(int amount) {
        this.amount = this.amount - amount - this.charges;
    }
    public void overload() {
        System.out.println("Overload 1");
    }
    public void overload(String s) {
        System.out.println("Overload 2");
        System.out.println("Non-Premitive Default Value: " + s);
    }
    public void overload(int p, String s) {
        System.out.println("Overload 3");
        System.out.println("Non-Premitive Default Value: " + t);
    }


}
