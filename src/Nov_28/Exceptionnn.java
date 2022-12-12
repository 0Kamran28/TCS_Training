package Nov_28;

public class Exceptionnn {
    public static void main(String args[]) {

        try {

            Number[] a = new Double[5];

            a[0] = 7;
        } catch (ArrayStoreException e) {

            System.out.println("ArrayStoreException");

        }
    }
}