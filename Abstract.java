abstract class Car{
    public abstract void drive();
    public abstract void stop();

    public void shown(){
        System.out.println("This is a car");
    }
}


abstract class Foard extends Car{
    public void drive(){
        System.out.println("This is a forad");
    }
}

class Updatefoard extends Foard{            // Concrete Class
    public void stop(){
        System.out.println("This is a forad stop");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Updatefoard obj = new Updatefoard();
       
       obj.drive();
       obj.stop();
       obj.shown();
    }
}
