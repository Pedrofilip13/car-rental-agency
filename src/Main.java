import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Information System!");

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Exit");

            int choice = getIntInput("Your choice: ");
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid one.");
            }
        }

        scanner.close();
    }

    private static void addVehicle() {
        System.out.println("Select the type of vehicle to add:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.println("3. Truck");
        int type = getIntInput("Your choice: ");

        System.out.print("Enter brand: ");
        String brand = scanner.next();

        System.out.print("Enter model: ");
        String model = scanner.next();

        int year = getIntInput("Enter year of manufacture: ");

        switch (type) {
            case 1: // Car
                int doors = getIntInput("Enter the number of doors: ");
                System.out.print("Enter fuel type (petrol, diesel, electric): ");
                String fuelType = scanner.next();
                vehicles.add(new Car(brand, model, year, doors, fuelType));
                System.out.println("Car added successfully!");
                break;
            case 2: // Motorcycle
                int wheels = getIntInput("Enter the number of wheels: ");
                System.out.print("Enter the type of motorcycle (sport, cruiser, off-road): ");
                String motorcycleType = scanner.next();
                vehicles.add(new Motorcycle(brand, model, year, wheels, motorcycleType));
                System.out.println("Motorcycle added successfully!");
                break;
            case 3: // Truck
                double capacity = getDoubleInput("Enter cargo capacity (in tons): ");
                System.out.print("Enter transmission type (manual, automatic): ");
                String transmissionType = scanner.next();
                vehicles.add(new Truck(brand, model, year, capacity, transmissionType));
                System.out.println("Truck added successfully!");
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }

    private static void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles added yet.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle details:");
            System.out.println("Make: " + vehicle.getBrand());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year of Manufacture: " + vehicle.getYearOfManufacture());
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Number of Doors: " + car.getNumberOfDoors());
                System.out.println("Fuel Type: " + car.getFuelType());
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Number of Wheels: " + motorcycle.getNumberOfWheels());
                System.out.println("Type: " + motorcycle.getTypeOfMotorcycle());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                System.out.println("Transmission Type: " + truck.getTransmissionType());
            }
        }
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next(); // Consume the invalid input
            System.out.print("Invalid input. Please enter a number: ");
        }
        return scanner.nextInt();
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next(); // Consume the invalid input
            System.out.print("Invalid input. Please enter a valid number: ");
        }
        return scanner.nextDouble();
    }
}
