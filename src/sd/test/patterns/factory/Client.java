package sd.test.patterns.factory;

public class Client {
    public static void main(String[] args) {
        DigitalServiceFactory factory = new DigitalServiceFactory();
        System.out.println(factory.getServiceInstance("SMS").notify("SD"));
        System.out.println(factory.getServiceInstance("Email").notify("SD"));
    }
}
