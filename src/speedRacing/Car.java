package speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private int distance;

    public Car(String model, int fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
    }

    public boolean drive(int distanceToDrive) {
        double needFuel = distanceToDrive * this.consumption;
        if (needFuel <= this.fuelAmount) {
            this.distance += distanceToDrive;
            this.fuelAmount -= needFuel;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distance);
    }
}
