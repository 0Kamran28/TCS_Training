package Nov_15;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable Cars;

    public MovableAdapterImpl(Movable Cars) {
        this.Cars = Cars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(Cars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}