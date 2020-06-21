package pl.camp.it.gui;

import pl.camp.it.db.VehicleRepository;
import pl.camp.it.model.Vehicle;

import java.util.Scanner;

public class GUI {

    private static final VehicleRepository cr = new VehicleRepository();
    private static final Scanner scanner = new Scanner(System.in);

     public static void showMainMenu() {
        System.out.println("1. Dostepne samochody");
        System.out.println("2. Wypozycz samochod");
        System.out.println("3. Exit");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showCar();
                break;
            case "2":
                rentCar();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Nieprawidlowy wybor");
                showMainMenu();
                break;
        }
    }

    private static void showCar() {
        for (Vehicle tempVehicle : cr.getVehicle()) {
            if (tempVehicle != null && !tempVehicle.isRent()) {
                System.out.println(tempVehicle);
            }
        }
        showMainMenu();
    }

    private static void rentCar() {
        System.out.println("Wpisz Id samochodu:");
        String carId = scanner.nextLine();
        for (Vehicle tempVehicle : cr.getVehicle()) {
            if (tempVehicle != null && tempVehicle.getId() == Integer.parseInt(carId)) {
                if (!tempVehicle.isRent()) {
                    tempVehicle.setRent(true);
                    System.out.println("Udalo sie");
                } else {
                    System.out.println("Auto niedostepne");
                }
                break;
            }
        }
        showMainMenu();
    }
}