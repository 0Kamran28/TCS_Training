package Nov_11;

public class Threads extends Thread {
    Number number;
    public Threads(Number number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Hi! using thread class");
        number.printNums(5);
    }
}
