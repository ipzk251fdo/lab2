package lab2.abstractfactory;

public class MainAbstract {

    public static void main(String[] args) {

        DeviceFactory factory;

        System.out.println("=== IProne devices ===");
        factory = new IProneFactory();

        factory.createLaptop().showLaptop();
        factory.createNetbook().showNetbook();
        factory.createEBook().showEBook();
        factory.createSmartphone().showSmartphone();


        System.out.println("\n=== Xiaomi devices ===");
        factory = new XiaomiFactory();

        factory.createLaptop().showLaptop();
        factory.createNetbook().showNetbook();
        factory.createEBook().showEBook();
        factory.createSmartphone().showSmartphone();


        System.out.println("\n=== Balaxy devices ===");
        factory = new BalaxyFactory();

        factory.createLaptop().showLaptop();
        factory.createNetbook().showNetbook();
        factory.createEBook().showEBook();
        factory.createSmartphone().showSmartphone();
    }
}
