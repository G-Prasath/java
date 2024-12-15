class Parant{
    String name = "Parant Variable";

    public Parant(){
        super();
        System.out.println("Parant Constructor");
    }

    public Parant(int a){
        this();
        System.out.println(a);
    }

    //  void Display(){                // Method Access
    //     System.out.println("Paraent Method");
    // }
}

class Child extends Parant{
    
    public Child(){
        super(50);
        System.out.println("Child Constructor");
    }

    public Child(int b){
        this();
        System.out.println(b);
    }

    //  void show(){    
    //     System.out.println("Child Display");
    // }

    // void release(){
    //     this.show();
    //     System.out.println(super.name);     // Variable Access
    //     super.Display();
    // }
}




public class Sup {
    public static void main(String[] args) {
        Child child = new Child(5);
        // child.release();
    }
}
