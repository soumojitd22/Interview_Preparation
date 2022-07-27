package sd.test.patterns.factory;

public class SMSService implements DigitalService {
    @Override
    public String notify(String userName) {
        return "Notifying " + userName + " through SMS";
    }
}
