package lab2.factorymethod;

public abstract class SubscriptionCreator {

    public abstract Subscription createSubscription();

    public void orderSubscription() {
        Subscription sub = createSubscription();
        sub.getInfo();
    }
}