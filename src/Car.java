public class Car implements Vehicle, CarVehicle {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private int numberOfDoors;
    private String fuelType;

    // Constructor
    public Car(String brand, String model, int year, int doors, String fuel) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = year;
        this.numberOfDoors = doors;
        this.fuelType = fuel;
    }

    // Implement Vehicle methods
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }

    // Implement CarVehicle methods
    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
}
