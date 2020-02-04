public class Overloading{
    
    public long sum(long a, long b) {
        return a + b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.sum(324,5435));
    }
}