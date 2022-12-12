package Nov_9.TrainExample;

import java.time.LocalDateTime;

public class Train {
    int trainNo;
    LocalDateTime departureTime;
    LocalDateTime arrivalTime;

    public Train() {
    }

    public Train(int trainNo, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.trainNo = trainNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNo=" + trainNo +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
