package factory.notification;

/**
 * Notification par Email
 */
public class EmailNotification implements Notification {
    @Override
    public void send(String destinataire, String message) {
        System.out.println("[EMAIL]");
        System.out.println("À: " + destinataire);
        System.out.println("Message: " + message);
        System.out.println("Email envoyé avec succès !\n");
    }

    @Override
    public String getType() {
        return "Email";
    }
}
