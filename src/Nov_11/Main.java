package Nov_11;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        Threads t1 = new Threads(number);
        t1.start();

        Threads2 t2 = new Threads2(number);
        Thread t = new Thread(t2);
        t.start();

        Runnable r =()-> System.out.println("Hello! through interface");
        Thread t3 = new Thread(r);
        t3.start();
    }
}