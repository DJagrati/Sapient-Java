public class GatewayClient{
    public static void main(String[] args) {
        PaymentGateway gateway = new GPay();

        if(args[0].equals("1")){
            gateway = new GPay();
        }

        else{
            gateway = new Paytm();
        }

        gateway.pay("J", "D", 7654, "Ameer hu mai!!!");
    }
}