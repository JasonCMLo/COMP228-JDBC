public class ThrowException {
    public static void main(String[] args) {
        myMethod();
        System.out.println("Welcome to COMP228");
    }


    public static void myMethod() throws ArrayIndexOutOfBoundsException{
        int num[] = {1, 2, 3, 4};
        System.out.println(num[2]);
        if(true) {
            throw new RuntimeException("You messed Up!");
        }
    }
}
