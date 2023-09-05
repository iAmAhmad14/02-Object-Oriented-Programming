public class Car extends Vehicle{
    private String carName;
    private double engineCapacity;
    private String vehicleType;
    private String color;
    private double sittingCapacity;
    public Car(String carName,double engineCapacity,String carType,String color,double sittingCapacity,String licensePlate)
    {
     super.setLicensePlate(licensePlate);
     this.carName=carName;
     this.engineCapacity=engineCapacity;
     this.vehicleType=carType;
     this.color=color;
     this.sittingCapacity=sittingCapacity;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setCarType(String carType) {
        this.vehicleType = carType;
    }

    public String getCarType() {
        return vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getSittingCapacity() {
        return sittingCapacity;
    }

    public void setSittingCapacity(int sittingCapacity) {
        this.sittingCapacity = sittingCapacity;
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate(licensePlate);
    }

    @Override
    public String toString() {
        return(carName+"    "+engineCapacity+"   "+vehicleType+"    "+color+"   "+sittingCapacity+"   "+licensePlate);
    }
}
