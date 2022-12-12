package Nov_8;

import java.time.LocalDate;

public class Laptop {
    String brand;
    String name;
    String display;
    String webcam;
    String processor;
    String graphicsCard;
    String storage;
    String backLight;
    int noOfPorts;
    int battery;
    LocalDate dateOfRelease;

    public Laptop() {
    }

    public Laptop(String brand, String name, String display, String webcam, String processor, String graphicsCard, String storage, String backLight, int noOfPorts, int battery, LocalDate dateOfRelease) {
        this.brand = brand;
        this.name = name;
        this.display = display;
        this.webcam = webcam;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.storage = storage;
        this.backLight = backLight;
        this.noOfPorts = noOfPorts;
        this.battery = battery;
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", display='" + display + '\'' +
                ", webcam='" + webcam + '\'' +
                ", processor='" + processor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", storage='" + storage + '\'' +
                ", backLight='" + backLight + '\'' +
                ", noOfPorts=" + noOfPorts +
                ", battery=" + battery + "W" +
                ", DateOfRelease=" + dateOfRelease +
                '}';
    }
}
