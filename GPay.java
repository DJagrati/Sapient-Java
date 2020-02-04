public class GPay implements PaymentGateway{
   
    public void pay(String from, String to, double amount, String comments) {

        System.out.println("Paid " + amount  +" to " + to + " using GPAY!!/n " + comments);
        
    }

    public void acceptPayment(String from, String to, double amount) {
        
        System.out.println(amount + "Received from: " + from);
    }
}