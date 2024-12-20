class OwnException extends Exception{
    OwnException(String str){
        super(str);
    }
}


public class CstmExceptions {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;

            if(j==0)
                throw new OwnException("This is Zero");

        } catch (OwnException e) {
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
