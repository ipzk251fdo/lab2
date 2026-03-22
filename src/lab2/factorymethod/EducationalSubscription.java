package lab2.factorymethod;

public class EducationalSubscription implements Subscription {

    @Override
    public void getInfo() {
        System.out.println("Educational subscription:");
        System.out.println("Price: 5$ per month");
        System.out.println("Min period: 6 months");
        System.out.println("Channels: Educational channels");
    }
}
