package Nov_28;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Kamran","Jammu"));
        list.add(new Person("Sahil","Jammu"));
        list.add(new Person("Atif","Maharashtra"));
        list.add(new Person("Tauseef","Delhi"));

        ArrayList<Person> list2 = (ArrayList<Person>) list.stream().filter(x -> x.getState().equals("Jammu")).collect(Collectors.toList());
        System.out.println(list2);
    }
}

class Person{
    String name;
    String state;

    public Person(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(state, person.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state);
    }
}
