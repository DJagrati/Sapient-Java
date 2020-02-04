import sun.net.www.content.audio.basic;

public class BankCustomer{
    public static void main(String args[]){
        Address address = new Address("K-152", "SCHC", "Noida", 201310);

        for (int ndex = 1; ndex <= 10; ndex++) {

            BankAccount bankAccount = new BankAccount(AccountType.SALARY_ACC, 40000, address);
            System.out.println(bankAccount.displayID());

        }




        // BankAccount bank1 = new BankAccount(AccountType.CURRENT_ACC, 43000, address);
        // //BankAccount bank2 = new BankAccount(address);

        // System.out.println(bank1.withdraw(23000));
        

    }
}