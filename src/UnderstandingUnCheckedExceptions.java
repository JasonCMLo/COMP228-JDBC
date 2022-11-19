import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UnderstandingUnCheckedExceptions {
    public static void main(String[] args) {
        myMethod();
        System.out.println("Welcome to COMP228");
    }


    public static void myMethod(){
//        int num[] = {1, 2, 3, 4};
//        System.out.println(num[4]);
        try {

            //30 LOCS
            int num[] = {1, 2, 3, 4};
            System.out.println(num[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("I'm in the FIRST block!");
        }


        try {
            //40 LOCS
            int num[] = {1, 2, 3, 4};
            System.out.println(num[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("I'm in the finally block!");
        }
    }
}
