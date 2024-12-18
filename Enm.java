enum Laptop{
    MacBook(2000), Dell, HP(1800);

    private int price;

    private Laptop(){       // Default contsructor
        price = 500;
    }

    private Laptop(int price){  // Parameterized COnstructor
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    
}



public class Enm {
    public static void main(String[] args) {
        // TODO code application logic here

        // Laptop lap = Laptop.MacBook;

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());
        }

    }
}
