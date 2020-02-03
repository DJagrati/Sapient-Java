public class ProgrammingConstruct{
    public static void main(String args[]){

        for (int index = 0; index < args.length ; index++){
        System.out.println(args[index]);
        }

        if (args.length > 0){
            System.out.println("No of cities passed: " + args.length);
        }

        else{
            System.out.println("None of the cities is passed");
        }


        int value =args.length;
        while(value > 0){

            System.out.println("Printing Value using loop " + args[value - 1]);
            value--;

        }

        //ARRAYS

        
    }

}