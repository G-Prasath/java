// Inner Class
class A{
    int num = 100;

    static class B{
        public void show(){
            System.out.println("Inside B");
        }
    }

    public void show(){
        System.out.println("Inside A");
    }
}


// Anonimyous inner Class
abstract class Anon{
    public abstract void show();
    public abstract void config();
}




public class Innercls{
    public static void main(String[] args) {

        // Inner Class
        A obj = new A();
        obj.show();
        System.out.println(obj.num);

        // A.B obj2 = obj.new B();  // Non Static Methods
        A.B obj2 = new A.B();  // Static Methods
        obj2.show();


        // Anonimyous Class without Name
        Anon anon = new Anon(){
            public void show(){
                System.out.println("New Anon Class");
            }

            public void config(){
                System.out.println("Nested Methods");
            }
        };
        anon.show();
        anon.config();


    }
}