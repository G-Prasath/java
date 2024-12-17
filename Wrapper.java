public class Wrapper {
    public static void main(String[] args) {
        int num1 = 8;
        // Integer num2 = new Integer(num1);  // Boxing
        
        Integer  num2 = num1; // Auto-Boxing

        int num3 = num2; // Auto unBoxing

        String str = "10";
        int num4 = Integer.parseInt(str);

        System.out.println(num4 * 5);

        System.out.println(num3);
    }
}
