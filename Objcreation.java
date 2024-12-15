class A {
    A() {
        System.out.println("Object Created ...");
    }

    public void show() {
        System.out.println("Show on");
    }
}

public class Objcreation {
    public static void main(String[] args) {
        // Obj Creation with referance variable
        A obj = new A();
        obj.show();

        A obj1;
        obj1 = new A();

        obj1.show();

        // Obj Creation without referance variable
        new A(); // Anonymous Obj Creation
        new A().show(); // Anonymous obj method calling

    }
}
