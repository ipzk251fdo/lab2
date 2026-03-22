package lab2.factorymethod;

public class WebSite extends SubscriptionCreator {

    @Override
    public Subscription createSubscription() {
        return new DomesticSubscription();
    }
}