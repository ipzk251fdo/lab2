package lab2.singleton;

public class MainSingleton {

    public static void main(String[] args) {

        Authenticator a1 = Authenticator.getInstance();
        a1.authenticate("User1");

        Authenticator a2 = Authenticator.getInstance();
        a2.authenticate("User2");

        Authenticator a3 = Authenticator.getInstance();
        a3.authenticate("Admin");

        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
    }
}