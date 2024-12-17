class Std{
    int rollNo;
    String name;
    int age;
}

public class Student {
    public static void main(String[] args) {
        Std s1 = new Std();
        s1.rollNo = 1;
        s1.name="Guru";

        Std s2 = new Std();
        s2.rollNo = 2;
        s2.name = "vishal";

        Std s3 = new Std();
        s3.rollNo = 3;
        s3.name = "Ram";

        Std stds[] = new Std[3];
        stds[0] = s1;
        stds[1] = s2;
        stds[2] = s3;


        for(Std datas: stds) {
            System.out.println(datas.rollNo + " " + datas.name);
        }
        
        // for(int i=0; i<stds.length; i++) {
        //     System.out.println(stds[i].name + " : " + stds[i].rollNo);
        // }

    }
}
