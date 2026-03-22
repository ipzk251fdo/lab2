package lab2.factorymethod;

public class MobileApp extends SubscriptionCreator {

    @Override
    public Subscription createSubscription() {
        return new EducationalSubscription();
    }
}
