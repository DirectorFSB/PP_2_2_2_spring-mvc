package web.model;

public class Car {
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    private String brand;

    private String model;

    private String number;

    public Car(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.brand;
    }
}
