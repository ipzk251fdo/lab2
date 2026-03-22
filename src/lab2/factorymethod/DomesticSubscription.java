package lab2.factorymethod;

public class DomesticSubscription implements Subscription {

    @Override
    public void getInfo() {
        System.out.println("Domestic subscription:");
        System.out.println("Price: 10$ per month");
        System.out.println("Min period: 1 month");
        System.out.println("Channels: Local TV channels");
    }
}
