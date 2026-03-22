package lab2;

import lab2.factorymethod.*;

public class Main {

    public static void main(String[] args) {

        SubscriptionCreator creator;

        System.out.println("=== Order from Website ===");
        creator = new WebSite();
        creator.orderSubscription();

        System.out.println("\n=== Order from Mobile App ===");
        creator = new MobileApp();
        creator.orderSubscription();

        System.out.println("\n=== Order by Manager Call ===");
        creator = new ManagerCall();
        creator.orderSubscription();
    }
}
