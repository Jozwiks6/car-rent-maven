package pl.camp.it.model;

public class Car extends Vehicle {


    public Car(int id, String brand, String model, String vin) {
       super(id, brand, model, vin);
    }


    @Override
    public String toString() {

        return new StringBuilder().append("Car:{\n")
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
                .append("}")
                .toString();
    }

}



