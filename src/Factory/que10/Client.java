package Factory.que10;

public class Client {

    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("truck");
        vehicle.rent();

//         If someone request Helicopter
//        Vehicle vehicle1 = VehicleFactory.getVehicle("helicopter");
//        IllegalArgumentException with message Vehicle Not available for rent is given

    }
}
