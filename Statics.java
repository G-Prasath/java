class Mobile{
    String name;
    static int price;
    String brand;

    public void show()
    {
        System.out.println(name + " : " + price + " : " + brand);
    }
}

public class Statics {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.name = "Samsung";
        Mobile.price = 30000;
        m1.brand = "SmartPhone";

        Mobile m2 = new Mobile();
        m2.name = "Iphone";
        Mobile.price = 20000;
        m2.brand = "SmartPhone";

        Mobile.price = 10;

        m1.show();
        m2.show();


    }
}