package Nov_9.TrainExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Train> list = new ArrayList<Train>();
        list.add(new Train(1, LocalDateTime.of(2022,11,25,12,25),LocalDateTime.of(2022,2,25,18,25)));
        list.add(new Train(2, LocalDateTime.of(2022,11,27,6,30),LocalDateTime.of(2022,2,27,12,10)));
        list.add(new Train(3, LocalDateTime.of(2022,11,27,4,40),LocalDateTime.of(2022,2,27,8,20)));
        list.forEach(System.out::println);

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        list.stream().map(s->s.arrivalTime.format(format)).forEach(System.out::println);
//        String formattedTime = list.get(0).arrivalTime.format(format);
//        System.out.println(formattedTime);
        Object obj = new Train();
        System.out.println(obj);
    }
}
