package lab2.abstractfactory;

public interface DeviceFactory {

    Laptop createLaptop();

    Netbook createNetbook();

    EBook createEBook();

    Smartphone createSmartphone();

}