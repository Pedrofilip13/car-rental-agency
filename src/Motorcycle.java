public class Motorcycle implements Vehicle, MotorVehicle {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private int numberOfWheels;
    private String typeOfMotorcycle;

    // Constructor
    public Motorcycle(String brand, String model, int year, int wheels, String type) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = year;
        this.numberOfWheels = wheels;
        this.typeOfMotorcycle = type;
    }

    // Implement Vehicle methods
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }

    // Implement MotorVehicle methods
    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }
    public String getTypeOfMotorcycle() { return typeOfMotorcycle; }
    public void setTypeOfMotorcycle(String type) { this.typeOfMotorcycle = type; }
}
