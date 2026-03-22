package lab2.abstractfactory;

public class BalaxyFactory implements DeviceFactory {

    @Override
    public Laptop createLaptop() {
        return new Laptop() {
            @Override
            public void showLaptop() {
                System.out.println("Balaxy Laptop created");
            }
        };
    }

    @Override
    public Netbook createNetbook() {
        return new Netbook() {
            @Override
            public void showNetbook() {
                System.out.println("Balaxy Netbook created");
            }
        };
    }

    @Override
    public EBook createEBook() {
        return new EBook() {
            @Override
            public void showEBook() {
                System.out.println("Balaxy EBook created");
            }
        };
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone() {
            @Override
            public void showSmartphone() {
                System.out.println("Balaxy Smartphone created");
            }
        };
    }
}