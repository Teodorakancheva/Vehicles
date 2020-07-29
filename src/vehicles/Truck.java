package vehicles;

public abstract class Truck extends Vehicle {

    private  double tonnage;

    public Truck(String model, String typeEngin, int yearOfMake, double price, double tonnage) {
        super(model, typeEngin, yearOfMake, price);
        this.setTonnage(tonnage);
    }

    public double getTonnage() {
        return tonnage;
    }

    private void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return String.format("Type vehicle: %s, model: %s, type engine: %s, year of make: %d, price: %.3f, tonnage: %.2f\n",
                this.getClass().getSimpleName(),
                super.getModel(),
                super.getTypeEngine(),
                super.getYearOfMake(),
                super.getPrice(),
                this.getTonnage());
    }
}
