
enum Gear {
    PARK, DRIVE, NEUTRAL, REVERSE
};

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("fiat", "yellow");
        c1.setGear(Gear.DRIVE);
        c1.serviceCosts(150, 300, 50, 1200);
        Car.License lic = new Car.License("34ABC123", "Görkem");
        System.out.println("Plaka: " + lic.number() + " Sahip: " + lic.owner());
    }
}

class Car {

    private String brand;
    private String color;
    private int speed;
    private static int carCount = 0;
    private static final int WHEEL_COUNT = 4;
    private Gear gear = Gear.PARK;

    record License(String number, String owner) {}

    public Car() {
        brand = "bilinmiyor";
        color = "bilinmiyor";
        carCount++;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    public static int getWheelCount() {
        return WHEEL_COUNT;
    }

    public void serviceCosts(int... costs) {
        int totalCost = 0;
        for (int c : costs) {
            totalCost += c;
        }
        System.out.println("toplam tutar: " + totalCost);
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public Car accelerate(int amount) {
        this.speed += amount;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void paint(String color) {
        if (color.toLowerCase().equals("black")) {
            System.out.println("Siyah renge boyanamaz!");
            return;
        }
        this.color = color;
    }
}
