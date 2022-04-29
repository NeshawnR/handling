import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        int a = 10;
        int b = 0;

        if(b == 0){
            System.out.println("Can't divide by Zero.");
        }else{
            int c = a / b;
            System.out.println(c);
        }
        ArrayList <Exception> possibleWrongStuff = new ArrayList<Exception>();

        try{

            int c = -3;
            int d = 0;
            int q = c / d;
            System.out.println(q);
        }catch(Exception e){
            possibleWrongStuff.add(e);
        }
        int[] ints = new int[](3, 2, 1);

        try {
            int t = ints[90];
        }catch(Exception e) {
            System.out.println("Item doesn't exist in array");
        }finally{
            System.out.println("The try catch block is done.");
        }
    }
}
