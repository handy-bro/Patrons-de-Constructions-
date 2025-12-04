package factory;

import factory.notification.EmailNotification;
import factory.notification.Notification;
import factory.notification.PushNotification;
import factory.notification.SMSNotification;

/**
 * FACTORY - Fabrique de notifications
 * Responsabilité : Créer les instances de notifications appropriées
 */
public class NotificationFactory {

    /**
     * Crée une notification selon le type demandé
     * @param type Type de notification (EMAIL, SMS, PUSH)
     * @return Instance de Notification
     * @throws IllegalArgumentException si le type n'est pas supporté
     */
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Le type de notification ne peut pas être null");
        }

        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Type de notification non supporté : " + type);
        };
    }
}