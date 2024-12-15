package tools.sprint;

class acc extends B{
    public void show(){
        System.out.println(bMark);
    }
}



public class B {
    public B(){
        System.out.println("This is B Class");
    }

    protected double bMark = 8000;
}
