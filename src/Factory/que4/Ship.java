package Factory.que4;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivering by Sea/Ocean");
    }
}
