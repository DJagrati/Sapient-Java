public class BankAccount{
    
    static double balance = 0;
    private double initBal;
    private AccountType accountType;
    private Address address;
    private long accID;
    private static long InitialAccountID = 2452457;

    public BankAccount(AccountType accountType ,double initBal, Address address){

        this.address = address;
        this.accountType = accountType;
        this.accID = ++InitialAccountID;

        switch (this.accountType) {
            case SAVING_ACC:
                
            if(initBal >= 10000){
                this.balance = initBal;
            }

            break;

            case CURRENT_ACC:

            if(initBal >= 25000){
                this.balance = initBal;
            }
                            
            break;

            case SALARY_ACC:
                this.balance = initBal;
            break;
        }      

    }

    
    public BankAccount( Address address){
       
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public  double checkBalance() {
    return balance;   
    }

    public double withdraw(double amount) {

        switch (this.accountType) {
            case SAVING_ACC:
                if(( this.balance - amount ) >= 10000){
                    balance -= amount;
                    System.out.print("Withdrawn, ");
                    return amount;
                }
            break;

            case CURRENT_ACC:
                if(( this.balance - amount ) >= 25000){
                    balance -= amount;
                    System.out.print("Withdrawn, ");
                    return amount;
                }
            break;

            case SALARY_ACC:
                if(( this.balance - amount ) >= 0){
                    balance -= amount;
                    System.out.print("Withdrawn, ");
                    return amount;
                }
            break;
        }      

        return -1;

    }

    public long displayID(){
        return this.accID;
    }

    public void deposit(int amount) {

        balance += amount;
        System.out.print("Deposited, ");
        System.out.println("Your current balance is: " +  checkBalance());
                
    }

}
