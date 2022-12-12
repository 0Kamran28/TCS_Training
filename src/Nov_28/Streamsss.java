package Nov_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsss {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Kamran","Jammu"));
        list.add(new Person("Sahil","Jammu"));
        list.add(new Person("Atif","Maharashtra"));
        list.add(new Person("Tauseef","Delhi"));

        ArrayList<Person> list2 = (ArrayList<Person>) list.stream().filter(x -> x.getState().equals("Jammu")).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(5,6,9,10,16);
    }
}
