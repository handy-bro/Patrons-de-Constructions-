package factory.notification;

public interface Notification {
    void send(String destinataire, String message);
    String getType();
}
