public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("saving", "RandomBuggy", "777664663664", 5000, 10);
        CurrentAccount currentAccount = new CurrentAccount("current", "RandomBuggy", "8764232377542", 10000, 20);
        System.out.println("type: " + savingAccount.type);
        System.out.println("name: " + savingAccount.name);
        System.out.println("number: " + savingAccount.number);
        System.out.println("amount: " + savingAccount.amount);
        System.out.println("charges: " + savingAccount.charges);
        savingAccount.deposite(500);
        System.out.println("amount: " + savingAccount.amount);
        savingAccount.withdraw(1000);
        System.out.println("amount: " + savingAccount.amount);



        System.out.println("type: " + currentAccount.type);
        System.out.println("name: " + currentAccount.name);
        System.out.println("number: " + currentAccount.number);
        System.out.println("amount: " + currentAccount.amount);
        System.out.println("charges: " + currentAccount.charges);
        currentAccount.deposite(500);
        System.out.println("amount: " + currentAccount.amount);
        currentAccount.withdraw(1000);
        System.out.println("amount: " + currentAccount.amount);

        savingAccount.overload();
        savingAccount.overload("tty");
        savingAccount.overload(45, "tty");
 
    }
}

