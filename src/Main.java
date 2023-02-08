import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car8 = new Car("BMW", "Z8", "черный", 3.0f, 2021, "Германия",
                "автомат", "родстер", 123456, 2, true, 200,
                true, true);

        System.out.println(car8);

        Bus bus1 = new Bus("MAN", "Lions", "синий", 2010, "Германия", 120);
        Bus bus2 = new Bus("GOLDEN DRAGON", " XML6127JR", "gold", 2013, "Китай", 150);
        Bus bus3 = new Bus("Hyundai", " UniverseSpace Luxury", "белый", 2018, "Южная Корея", 140);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}
