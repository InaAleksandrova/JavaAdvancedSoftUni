package carSalesman;

public class Car {
    private String model;
    private String engineModel;
    private int weight;
    private String color = "n/a";

    public Car(String model, String engineModel) {
        this.model = model;
        this.engineModel = engineModel;
    }

    public Car(String model, String engineModel, int weight, String color) {
        this(model, engineModel);
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engineModel, int weight) {
        this(model, engineModel);
        this.weight = weight;
    }

    public Car(String model, String engineModel, String color) {
        this(model, engineModel);
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
