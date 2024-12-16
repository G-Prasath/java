import tools.A;
import tools.sprint.*;

class Protct extends B {
    public void show() {
        // System.out.println(bMark);
    }

    private int result = 100;

    void getResult(){
        System.out.println(result);
    }

}

public class Access {
    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.mark); // Public

        Protct obj1 = new Protct();  // Protected
        obj1.show();

        obj1.getResult();           // Private



    }
}
