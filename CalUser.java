public class CalUser{
    public static void main(String args[]){
        
        //data-type varName = new data-type();

        Calculator calculator= new Calculator();

        System.out.println("Sum: " + calculator.add(423, 745));
        System.out.println("Sub: " + calculator.substract(423, 745));
        System.out.println("Mul: " + calculator.multiply(423, 745));
        System.out.println("Div: " + calculator.divide(423, 745));
        System.out.println("Mod: " + calculator.modulo(423, 745));
    }
}