package Transport;

public class Car extends Transport {

    private class Key {

        private final boolean isRemoteEngineStart;
        private final boolean isKeylessEntry;

        public Key(boolean isRemoteEngineStart, boolean isKeylessEntry) {
            this.isRemoteEngineStart = isRemoteEngineStart;
            this.isKeylessEntry = isKeylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return isKeylessEntry;
        }
    }


    private Float engineVolume;
    private String transmission;
    private final String bodyType;
    private int regNumber;
    private final int numberOfSeats;
    private boolean tyresType;

    private final Key key;


    @Override
    public String toString() {
        return super.toString() +
                ", объем двигателя " + engineVolume +
                ", коробка передач " + transmission +
                ", кузов " + bodyType +
                ", регистрационный номер " + regNumber +
                ", количество мест - " + numberOfSeats +
                ", тип резины: " + getTyresType() +
                ", Удаленный запуск двигателя: " + key.isRemoteEngineStart() +
                ", Бесключевой доступ: " + key.isKeylessEntry();
    }

    public Car(String brand,
               String model,
               String color,
               Float engineVolume,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               int regNumber,
               int numberOfSeats,
               boolean tyresType,
               int maxSpeed,
               boolean isRemoteEngineStart,
               boolean isKeylessEntry) {

        super(brand, model, color, productionYear, productionCountry, maxSpeed);

        setEngineVolume(engineVolume);

        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        setRegNumber(regNumber);

        if (numberOfSeats < 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.tyresType = tyresType;

        key = new Key(isRemoteEngineStart, isKeylessEntry);
    }

    public void changeTyres(int month) {

        tyresType = month < 4 || month > 9;  //зимняя резина
    }

    public String getTyresType() {
        if (tyresType) {
            return "Зимняя резина";
        } else {
            return "Летняя резина";
        }
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTyresType() {
        return tyresType;
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 0f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(int regNumber) {
        if (regNumber < 0) {
            this.regNumber = 0;
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setTyresType(boolean tyresType) {
        this.tyresType = tyresType;
    }
}
