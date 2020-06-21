public class Bus extends Vehicle {

    private int personsAmount;
    private int wheelsCount;

    public Bus(int id, String brand, String model, String vin, int personsAmount, int wheelsCount) {
        super(id, brand, model, vin);
        this.personsAmount = personsAmount;
        this.wheelsCount = wheelsCount;
    }

    public int getPersonsAmount() {return this.personsAmount; }
    public int getWheelsCount() {return  this.personsAmount;}

    @Override
    public String toString() {

        return new StringBuilder()
                .append("Bus:{\n")
                .append("id = ")
                .append(this.getId())
                .append("\n")
                .append("Brand = ")
                .append(this.getBrand())
                .append("\n")
                .append("Model = ")
                .append(this.getModel())
                .append("\n")
                .append("vin = ")
                .append(this.getVin())
                .append("\n")
                .append("Person Amount = ")
                .append(this.personsAmount)
                .append("Wheel Count = ")
                .append(this.wheelsCount)
                .append("}")
                .toString();
    }


}
