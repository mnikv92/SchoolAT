import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    //it's Main origin
    public static void main(String[] args) {
        Honda Honda1 = new Honda(2012, "CVT", "Fit",
                "front", "blue", 1.3, 88);
        Honda Honda2 = new Honda(2020, "CVT", "Insight",
                "front", "black", 1.5, 120);
        Toyota Toyota1 = new Toyota(2003, "CVT", "Prius",
                "front", "grey", 1.5, 78);
        Toyota Toyota2 = new Toyota(2012, "auto", "Prado",
                "4wd", "black", 2.7, 150);
        Nissan Nissan1 = new Nissan(2017, "CVT", "Note",
                "front", "silver", 1.2, 90);
        Nissan Nissan2 = new Nissan(2003, "manual", "Skyline",
                "rear", "blue", 2.5, 280);
        Mazda Mazda1 = new Mazda(2010, "auto", "Demio",
                "front", "green", 1.3, 90);
        Mazda Mazda2 = new Mazda(2020, "auto", "CX-5",
                "4wd", "red", 2.5, 186);
        Mitsubishi Mitsubishi1 = new Mitsubishi(2005, "manual", "Lancer Evolution V8",
                "4wd", "yellow", 2.5, 280);
        Mitsubishi Mitsubishi2 = new Mitsubishi(2019, "auto", "ASX",
                "4wd", "white", 1.8, 135);

        List<Car> cars = new ArrayList<>();
        cars = Arrays.asList(Honda1, Honda2, Toyota1, Toyota2, Nissan1,
                Nissan2, Mazda1, Mazda2, Mitsubishi1, Mitsubishi2);

        Methods.yearCheck(cars);
        Methods.colorChange(cars);
        Methods.canItDrift(cars);

    }
}


abstract class Car {
    private int prodAge;
    private String gearbox;
    private String model;
    private String wheelDrive;
    private String color;
    private double engineVolume;
    private int horsepower;

    @Override
    public String toString() {
        return model + " " +
                prodAge +
                ", gearbox='" + gearbox + '\'' +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", horsepower=" + horsepower;
    }

    public Car(int prodAge, String gearbox, String model, String wheelDrive, String color,
               double engineVolume, int horsepower) {
        this.prodAge = prodAge;
        this.gearbox = gearbox;
        this.model = model;
        this.wheelDrive = wheelDrive;
        this.color = color;
        this.engineVolume = engineVolume;
        this.horsepower = horsepower;
    }

    public int getProdAge() {
        return prodAge;
    }

    public void setProdAge(int prodAge) {
        this.prodAge = prodAge;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


}

class Honda extends Car {
    public Honda(int prodAge, String gearbox, String model, String wheelDrive,
                 String color, double engineVolume, int horsepower) {
        super(prodAge, gearbox, model, wheelDrive, color, engineVolume, horsepower);
    }
}

class Toyota extends Car {
    public Toyota(int prodAge, String gearbox, String model, String wheelDrive,
                  String color, double engineVolume, int horsepower) {
        super(prodAge, gearbox, model, wheelDrive, color, engineVolume, horsepower);
    }


}

class Nissan extends Car {
    public Nissan(int prodAge, String gearbox, String model, String wheelDrive,
                  String color, double engineVolume, int horsepower) {
        super(prodAge, gearbox, model, wheelDrive, color, engineVolume, horsepower);
    }
}

class Mazda extends Car {
    public Mazda(int prodAge, String gearbox, String model, String wheelDrive,
                 String color, double engineVolume, int horsepower) {
        super(prodAge, gearbox, model, wheelDrive, color, engineVolume, horsepower);
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int prodAge, String gearbox, String model, String wheelDrive,
                      String color, double engineVolume, int horsepower) {
        super(prodAge, gearbox, model, wheelDrive, color, engineVolume, horsepower);
    }
}

class Methods {
    public static void yearCheck(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getProdAge() >= 2006) {
                System.out.println(cars.get(i));
            } else {
                System.out.println("Устаревший авто");
            }
        }
        System.out.println();
    }

    public static void colorChange(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (Objects.equals(cars.get(i).getColor(), "green")) {
                cars.get(i).setColor("red");
                System.out.println(cars.get(i));
            }
        }
        System.out.println();

    }

    public static void canItDrift(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if ((Objects.equals(cars.get(i).getGearbox(), "CVT")) &
                    ((Objects.equals(cars.get(i).getWheelDrive(), "front")))) {
                System.out.println(cars.get(i) + " боком не едет");
            }
        }
        System.out.println();

    }
}