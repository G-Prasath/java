public class Strings {
    public static void main(String[] args) {
        String name = new String("Guru");
        name =  name + " Prasath";
        System.out.println(name);


        String name2 = "Guru";
        String name3 = "Guru";
        System.out.println(name3 == name2);

        StringBuffer sb = new StringBuffer("Guru");
        System.out.println(sb.capacity());
        sb.append(" Prasath");
        sb.insert(5, "Log");
        System.out.println(sb);

}   }
