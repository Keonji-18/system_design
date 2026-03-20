package Factory.que4;

public class Client {
    public static void main(String[] args) {
        Logistics truckFactory = new RoadLogistics();
        Logistics shipFactory = new SeaLogistics();

        Transport truck = truckFactory.createTransport();
        truck.deliver();

        Transport ship = shipFactory.createTransport();
        ship.deliver();

    }
}
