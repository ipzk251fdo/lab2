package lab2.abstractfactory;

public class XiaomiFactory implements DeviceFactory {

    @Override
    public Laptop createLaptop() {
        return new Laptop() {
            @Override
            public void showLaptop() {
                System.out.println("Xiaomi Laptop created");
            }
        };
    }

    @Override
    public Netbook createNetbook() {
        return new Netbook() {
            @Override
            public void showNetbook() {
                System.out.println("Xiaomi Netbook created");
            }
        };
    }

    @Override
    public EBook createEBook() {
        return new EBook() {
            @Override
            public void showEBook() {
                System.out.println("Xiaomi EBook created");
            }
        };
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone() {
            @Override
            public void showSmartphone() {
                System.out.println("Xiaomi Smartphone created");
            }
        };
    }
}