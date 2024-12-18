interface A
{
    void show();
    void config();
}

interface B extends A
{
    void run();
}

class X implements B{
    public void show() {
        System.out.println("Show method");
    }
    public void config() {
        System.out.println("Config method");
    }
    public void run(){
        System.out.println("Run Methods On");
    }
}




public class Nstinterface{
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        obj.config();


    }
}