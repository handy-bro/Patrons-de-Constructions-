import factory.service.NotificationService;

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        // Envoi de différents types de notifications
        System.out.println("\n********** Envoi de notifications diverses **********\n");
        service.notifierUtilisateur("EMAIL", "handymelong237@gmail.com",
                "Bienvenue sur notre plateforme !");

        service.notifierUtilisateur("SMS", "+237 6 56 93 26 36",
                "Votre code de vérification : 123456");

        service.notifierUtilisateur("PUSH", "abc123",
                "Vous avez un nouveau message");
    }
}