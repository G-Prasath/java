interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop Code, Compile, Run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop code, Compile, run");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Developer obj = new Developer();
        obj.devApp(lap);
    }
}
