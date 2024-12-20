public class Exceptions{
    public static void main(String[] args) {
        int i = 0;
        int j = 5;

        try {
            i = 10 / j;
        } catch (Exception e) {
           System.out.println("Something went wrong");
        }

        System.out.println(i);
        System.out.println("Bye");
    }
}