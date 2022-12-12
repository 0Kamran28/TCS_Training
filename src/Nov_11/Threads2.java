package Nov_11;

public class Threads2 implements Runnable{
    Number number;

    public Threads2(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("hi! using thread Interface");
        number.printNums(10);
    }
}
