package sd.test.patterns.singleton;

public final class SingletonObject {
    private static volatile SingletonObject singletonObject;

    private SingletonObject() {
        if (singletonObject != null)
            throw new RuntimeException("Singleton instance already created");

    }

    public static SingletonObject getInstance() {
        if (singletonObject == null) {
            synchronized (SingletonObject.class) {
                if (singletonObject == null)
                    singletonObject = new SingletonObject();
            }
        }

        return singletonObject;
    }
}
