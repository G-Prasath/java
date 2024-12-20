
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}


public class Throws {
    static{
        System.out.println("Class Called !");
    }

    public static void main(String[] args) {
       A obj = new A();
       try {
            obj.show();
       } catch (ClassNotFoundException e) {
            System.out.println(e);
       }
    }
}
