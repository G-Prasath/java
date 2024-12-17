class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("B");
    }
}


public class Downupcasting {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        // Downcasting
        B obj2 = (B) obj;
        obj2.show2();
    
    }
}
