package lab2.factorymethod;

public class ManagerCall extends SubscriptionCreator {

    @Override
    public Subscription createSubscription() {
        return new PremiumSubscription();
    }
}