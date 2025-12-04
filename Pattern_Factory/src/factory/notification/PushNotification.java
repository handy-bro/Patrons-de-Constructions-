package factory.notification;

/**
 * Notification Push (mobile)
 */
public class PushNotification implements Notification {

    @Override
    public void send(String destinataire, String message) {
        System.out.println("[PUSH NOTIFICATION]");
        System.out.println("ID Appareil: " + destinataire);
        System.out.println("Message: " + message);
        System.out.println("Notification push envoyée !\n");
    }

    @Override
    public String getType() {
        return "Push";
    }
}
