package sd.test.patterns.factory;

public class EmailService implements DigitalService {
    @Override
    public String notify(String userName) {
        return "Notifying " + userName + " through Email";
    }
}
