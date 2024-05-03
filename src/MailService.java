public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        //Send email;
        disconnect();
    }
    // Abstraction - setting these as private since users do not need to know about these.
    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
