package Nov_8;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        ArrayList<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Acer","Nitro 5","IPS lcd","720p","i5 7th Gen","1050ti","1tb","yes",5,135, LocalDate.of(2017,11,27)));
        list.add(new Laptop("Apple","MacBook pro","Oled","1080p","M1 pro","NA","512gb","yes",5,115,LocalDate.of(2022,1,1)));
        list.add(new Laptop("Lenovo","Legion","IPS lcd","720p","i9 9th Gen","3050ti","1tb","yes",6,135,LocalDate.of(2020,3,17)));
        list.add(new Laptop("Dell","XPS 13","Oled","1080p","i9 12th Gen","3050ti","512gb","yes",3,100,LocalDate.of(2022,5,22)));
        list.add(new Laptop("Apple","MacBook Air","Liquid Retina","720p","M1","NA","256gb","yes",3,100,LocalDate.of(2018,7,25)));
//        for(Laptop lap:list) {
//            System.out.println(lap);
//        }
        list.stream().filter(s-> s.noOfPorts < 3).forEach(l -> System.out.println(l));
        PrintList p = (lists -> lists.forEach(s -> System.out.println(lists)));
        p.printList(list);
    }
}