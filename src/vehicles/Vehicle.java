package vehicles;

public abstract class Vehicle implements IVehicle {

    private String model;
    private String typeEngine;
    private int yearOfMake;
    private double price;

    public Vehicle(String model, String typeEngine, int yearOfMake, double prise) {
        this.model = model;
        this.typeEngine = typeEngine;
        this.yearOfMake = yearOfMake;
        this.price = prise;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getTypeEngine() {
        return typeEngine;
    }

    @Override
    public int getYearOfMake() {
        return yearOfMake;
    }

    @Override
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }
}
