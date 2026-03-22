package Factory.que10;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        switch (type.toLowerCase()){
            case "car" : return new Car();
            case "bike" : return new Bike();
            case "truck" : return new Truck();
            default: throw new IllegalArgumentException("Vehicle Not available for rent");
        }
    }
}
