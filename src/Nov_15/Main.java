package Nov_15;

public class Main {
    public static void main(String[] args) {
        Movable bugatti= new Bugatti();
        MovableAdapter bugattiAdapter = new MovableAdapterImpl(bugatti);
        System.out.println(bugatti.getSpeed());
        System.out.println(bugattiAdapter.getSpeed());
    }
}
