public class MethodCallStack{
    public static void main(String args[]){
        System.out.println("Called before executing M1");
        method1();
        System.out.println("Called after executing M1");
    }

    public static void  method1(){
        System.out.println("Called before executing M2");
        method2();
        System.out.println("Called after executing M2");
    }

    public static void  method2(){
        System.out.println("Called before executing M3");
        method3();
        System.out.println("Called after executing M3");
    }

    public static void  method3(){
        System.out.println("Called in M3");
      
    }

}