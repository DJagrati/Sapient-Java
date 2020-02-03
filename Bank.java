public class Bank{
    
    static int balance;

    public  int checkBalance() {
    return balance;   
    }

    public void withdraw(int amount) {

        if(amount <= balance){
            balance -= amount;
            System.out.print("Withdrawn, ");
            System.out.println("Your current balance is: " +  checkBalance());
        }

        else{
            System.out.println("Balance Low!!!");
        }

    }

    public void deposit(int amount) {

        balance += amount;
        System.out.print("Deposited, ");
        System.out.println("Your current balance is: " +  checkBalance());
                
    }

}
