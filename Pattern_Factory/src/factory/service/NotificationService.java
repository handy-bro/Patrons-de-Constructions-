package factory.service;

import factory.NotificationFactory;
import factory.notification.Notification;

/**
 * Service qui utilise la fabrique de notifications
 * Responsabilité : Logique métier pour l'envoi de notifications
 */
public class NotificationService {

    /**
     * Notifie un utilisateur avec le type spécifié
     */
    public void notifierUtilisateur(String type, String destinataire, String message) {
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(destinataire, message);
    }
}