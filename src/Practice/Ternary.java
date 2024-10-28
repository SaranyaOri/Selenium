package Practice;

public class Ternary {
    public static void main(String[] args) {
        int a=10, b=30, c=20;
        int result = (a >= b && a >= c) ? a : (b>=c ? b : c);
        System.out.println("Max Number is -> " +  result);
    }
}
