public class VehicleRepository {
    private Vehicle[] Vehicle = new Vehicle[10];


    VehicleRepository() {
        Car c1 = new Car(1, "BMW", "3", "dsadas");
        Car c2 = new Car(2, "Toyta", "Corolla", "dsadsad");
        Car c3 = new Car(3, "Audi", "a4", "sdawdwadvvddsa");

        this.Vehicle[0] = c1;
        this.Vehicle[1] = c2;
        this.Vehicle[2] = c3;

        this.Vehicle[3] = new Bus(4, "solaris", "152", "dsadsad", 40, 6);

        this.Vehicle[4] = new Bus(5, "Solaris", "a100", "dsad", 45, 6);

    }

    public Vehicle[] getVehicle() {
        return Vehicle;
    }
}
