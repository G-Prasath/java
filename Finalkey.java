final class Test {          // Final Class
    public void show(){
        System.out.println("in Test Class");
    }
}

class Finalmeth{            // final Method don't overriding
   final public void show(){
        System.out.println("in Finalmeth Class");
    }
}


class Fa extends Finalmeth{
    final int num = 100;   // Final Key word Don't Modify Variale

}


public class Finalkey {
    public static void main(String[] args) {
        Fa obj = new Fa();
        System.out.println(obj.num);
        obj.show();

    }
}
