package Core;

public class final2 {
    public static int greet() {
        int result = 0;
        try {                //any exception we try here as we give exception in try block
            int a = 20;
            int b = 0;
            result = a / b;
        } catch (Exception e) {   //then in this we are catching the exception
            System.out.println(e);
        } finally {                //then this is the finally block which is going to be executed
            System.out.println("Our program ends");
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int k = greet();
        System.out.println(k);
    }
}
