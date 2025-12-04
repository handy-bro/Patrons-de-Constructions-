package factory.notification;

/**
 * Notification par SMS
 */
public class SMSNotification implements Notification {

    @Override
    public void send(String destinataire, String message) {
        System.out.println("[SMS]");
        System.out.println("Numéro: " + destinataire);
        System.out.println("Message: " + message);
        System.out.println("SMS envoyé avec succès !\n");
    }

    @Override
    public String getType() {
        return "SMS";
    }
}
