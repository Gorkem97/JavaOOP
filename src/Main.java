
import model.Car;
import model.Gear;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("fiat", "yellow");
        c1.setGear(Gear.DRIVE);
        c1.serviceCosts(150, 300, 50, 1200);
        Car.License lic = new Car.License("34ABC123", "Görkem");
        System.out.println("Plaka: " + lic.number() + " Sahip: " + lic.owner());
    }
}
