class Stds{
    private String name;
    private int age;

    public Stds(){          // Default Constructors
        name = "Guru";
        age = 28;
    }

    public Stds(String name, int age){  // Parametrized Construtor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}


public class Encaps {
    public static void main(String[] args) {
        Stds obj = new Stds("ram", 57);

        // obj.setName("Guru");
        // obj.setAge(27);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
