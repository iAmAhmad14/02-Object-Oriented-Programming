public class Truck extends Vehicle{
    private String truckName;
    private double engineCapacity;
    private String vehicleType;
    private String color;
    private double loadingCapacity;
    public Truck(String truckName,double engineCapacity,String truckType,String color,double loadingCapacity,String licensePlate)
    {
        super.setLicensePlate(licensePlate);
        this.truckName=truckName;
        this.engineCapacity=engineCapacity;
        this.vehicleType=truckType;
        this.color=color;
        this.loadingCapacity=loadingCapacity;
    }

    public String getTruckName() {
        return truckName;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getTruckType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate(licensePlate);
    }
    @Override
    public String toString() {
        return(truckName+"    "+engineCapacity+"   "+vehicleType+"    "+color+"   "+loadingCapacity+"   "+licensePlate);
    }
}
