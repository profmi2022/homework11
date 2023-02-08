package Transport;

public class Transport {

    protected final String brand;
    protected final String model;
    protected String color;
    protected final int productionYear;
    protected final String productionCountry;
    protected int maxSpeed;

    @Override
    public String toString() {
        return brand + " " + model +
                ", цвет " + color +
                ", год выпуска " + productionYear +
                ", страна сборки: " + productionCountry +
                ", максимальная скорость: " + maxSpeed + " км/ч";
    }

    public Transport() {
        brand = "default";
        model = "default";
        color = "белый";
        productionYear = 1900;
        productionCountry = "default";
        maxSpeed = 0;
    }

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        this.setColor(color);

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        this.setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}

