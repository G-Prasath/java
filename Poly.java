class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public void show(){
        System.out.println("B");
    }
}

class C extends A{
    public void show(){
        System.out.println("C");
    }
}

class D extends C{
    public void show(){
        System.out.println("D");
    }
}


public class Poly {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        obj = new D();
        obj.show();
    }
}
