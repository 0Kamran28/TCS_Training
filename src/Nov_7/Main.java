package Nov_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person_validation p = new Person_validation();
        Person person = new Person();
        ArrayList<Person> list = new ArrayList<>();
        do {

            while (true) {
                person.name = sc.nextLine();
                if (p.nameValidator(person.name)) {
                    System.out.println("incorrect name,enter again");
                } else {
                    break;
                }
            }


            while (true) {
                person.age = sc.nextInt();
                if (p.ageValidator(person.age)) {
                    System.out.println("incorrect age,enter again");
                } else {
                    break;
                }
            }


            while (true) {
                person.height = sc.nextDouble();
                sc.nextLine();
                if (p.heightValidator(person.height)) {
                    System.out.println("incorrect height,enter again");
                } else {
                    break;
                }
            }
            list.add(person);
            System.out.println("Do you want to add another person?, press y else press any button.");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
}
