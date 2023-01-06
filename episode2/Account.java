public class Account {
    public String type;
    public String name;
    public String number;
    public int amount;

    public Account(String type, String name, String number, int amount) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.amount = amount;
    }
    public void withdraw(int amount) {
        this.amount = this.amount - amount;
    }
    public void deposite(int amount) {
        this.amount = this.amount + amount;
    }
}
