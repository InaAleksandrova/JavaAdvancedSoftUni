package definingClassesLab;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this(brand, model);
        this.horsePower = horsePower;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int verifyHPisMoreThanZero(int horsePower) {
        return Math.max(horsePower, 0);
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = verifyHPisMoreThanZero(horsePower);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void increaseHP(int horsePower) {
        this.horsePower += verifyHPisMoreThanZero(horsePower);
    }

    public String carInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand() ,
                this.getModel() != null ? this.getModel() : "unknown",
                this.getHorsePower() != 0 ? this.getHorsePower() : -1);
    }
}
