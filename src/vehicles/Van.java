package vehicles;

public class Van extends Truck{


    public Van(String model, String typeEngin, int yearOfMake, double price, double tonnage) {
        super(model, typeEngin, yearOfMake, price, tonnage);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getYearOfMake() {
        return 0;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getTypeEngine() {
        return null;
    }
}
