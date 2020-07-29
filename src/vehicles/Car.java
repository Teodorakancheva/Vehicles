package vehicles;

public class Car extends Vehicle {

    private String bodyTypes;
    private int countPassenger;

    public Car(String model, String typeEngine, int yearOfMake, double price, String bodyTypes,int countPassenger) {
        super(model, typeEngine, yearOfMake, price);
        this.setBodyTypes(bodyTypes);
        this.setCountPassenger(countPassenger);
    }

    private void setBodyTypes(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    private void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public double getPrice() {
      return super.getPrice();
    }

    @Override
    public int getYearOfMake() {
        return super.getYearOfMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getTypeEngine() {
        return super.getTypeEngine();
    }

    @Override
    public String toString() {
        //String model, String typeEngin, int yearOfMake, double prise, String bodyTypes,int countPassenger
        return String.format("Type vehicle: %s, model: %s, type engine: %s, year of make: %d, type coupe: %s, count passenger: %d, price\n",
                this.getClass().getSimpleName(),
                super.getModel(),
                super.getTypeEngine(),
                super.getYearOfMake(),
                this.bodyTypes,
                this.countPassenger,
                super.getPrice());
    }
}
