import java.util.HashSet;

public class VehicleInventory {
    HashSet<Vehicle> hs= new java.util.HashSet<>();
    public void addVehicle(String name,double engineCapacity,String type,String color,double cpacity,String licensePlate)
    {
        if(type=="Car") {
            Car c=new Car(name,engineCapacity,type,color,cpacity,licensePlate);
           hs.add(c);
        }
        if(type=="Truck")
        { Truck t=new Truck(name,engineCapacity,type,color,cpacity,licensePlate);
            hs.add(t);

        }
        }


            public void showCarsList()
            {
                for (var a : hs) {
                    System.out.println(a);
                }
            }




}


