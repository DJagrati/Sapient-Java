public class CallByRef{
    public static void main(String args[]){
        
        int primitiveValue = 100;
        int[] intArray = new int[10];
        callByValue(primitiveValue);
        System.out.println("Value After CBV: " + primitiveValue);
        
        callByReference(intArray);
        System.out.println("Value After CBR: " + intArray[0]);

    }

    public static void callByValue(int value) {
        ++value;
        System.out.println("Within CBV Method: " + value);
    }

    public static void callByReference(int[] arr) {
        System.out.println("Writing the CBR method, the value of Array is: " + arr[0]);
        arr[0] = 16;
        System.out.println("After CBR method, the value of Array is: " + arr[0]);
    }
}