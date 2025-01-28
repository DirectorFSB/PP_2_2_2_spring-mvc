package web.model;

public class Car {
    private String brand;

    private String model;

    private String number;

    public Car(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return this.brand;
    }
}
