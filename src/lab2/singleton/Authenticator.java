package lab2.singleton;

public class Authenticator {

    private static volatile Authenticator instance;

    private Authenticator() {
        System.out.println("Authenticator created");
    }

    public static Authenticator getInstance() {
        if (instance == null) {
            synchronized (Authenticator.class) {
                if (instance == null) {
                    instance = new Authenticator();
                }
            }
        }
        return instance;
    }

    public void authenticate(String user) {
        System.out.println("User " + user + " authenticated");
    }
}
