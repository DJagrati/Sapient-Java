public class BankClient{
    public static void main(String args[]){
        Bank bank = new Bank(5000, "212, GGN GURGAON 213321");
        System.out.println(bank.checkBalance());
        bank.deposit(200000);
        bank.withdraw(4336);
        bank.withdraw(32821);
        bank.deposit(4638);
        bank.checkBalance();
        bank.withdraw(1700000);

    }
}