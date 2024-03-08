public class Truck implements Vehicle, TruckVehicle {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private double cargoCapacity;
    private String transmissionType;

    // Constructor
    public Truck(String brand, String model, int year, double capacity, String transmission) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = year;
        this.cargoCapacity = capacity;
        this.transmissionType = transmission;
    }

    // Implement Vehicle methods
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }

    // Implement TruckVehicle methods
    public double getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }
    public String getTransmissionType() { return transmissionType; }
    public void setTransmissionType(String transmission) { this.transmissionType = transmission; }
}
