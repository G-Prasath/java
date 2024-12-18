class A{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("Hello, I am A");
    }
}

class B extends A{

    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("Hello, I am B");
    }
}


public class Anotations {
    public static void main(String[] args) {
        new B().showTheDataWhichBelongsToThisClass();
    }
}
