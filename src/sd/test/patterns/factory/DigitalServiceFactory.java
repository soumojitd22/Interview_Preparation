package sd.test.patterns.factory;

public class DigitalServiceFactory {
    public DigitalService getServiceInstance(String digitalChannel) {
        if ("SMS".equals(digitalChannel))
            return new SMSService();
        else if ("Email".equals(digitalChannel))
            return new EmailService();
        else
            return null;

    }
}
