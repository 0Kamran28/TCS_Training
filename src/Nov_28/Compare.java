package Nov_28;

import java.util.Objects;

public class Compare<p> {
    p id;
    String name;

    public Compare(p id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Compare<String> obj1= new Compare("1","haha");
        Compare<Integer> obj2= new Compare(1,"haha");
        Compare<String> obj3 =  obj1;

        if(obj1.equals(obj2))
            System.out.println("Similar");
        else
            System.out.println("Different");

        if(obj1.equals(obj3))
            System.out.println("Similar");
        else
            System.out.println("Different");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compare<?> compare = (Compare<?>) o;
        return Objects.equals(id, compare.id) && Objects.equals(name, compare.name);
    }

}