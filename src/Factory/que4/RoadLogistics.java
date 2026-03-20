package Factory.que4;

public class RoadLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
