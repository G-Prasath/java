public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;

            if(j==0)
                throw new ArithmeticException("This is Zero");

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
