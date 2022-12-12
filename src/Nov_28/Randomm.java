package Nov_28;

import java.util.Random;
public class Randomm {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(50);
        System.out.println(a);
        if(a/2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
