@FunctionalInterface
interface A{
    int add(int i, int j);
}


public class Lambda {
    public static void main(String[] args) {
       A obj = (i, j) -> i+j;  // Lambda Expression only work in functional interface
       System.out.println(obj.add(10, 50));
    }
}
