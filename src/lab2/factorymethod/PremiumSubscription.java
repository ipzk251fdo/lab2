package lab2.factorymethod;

public class PremiumSubscription implements Subscription {

    @Override
    public void getInfo() {
        System.out.println("Premium subscription:");
        System.out.println("Price: 20$ per month");
        System.out.println("Min period: 12 months");
        System.out.println("Channels: All channels + Movies + Sport");
    }
}
