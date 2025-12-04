package abstractFactory.util;

import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.LinuxFactory;
import abstractFactory.factory.WindowsFactory;

/**
 * Utilitaire pour détecter le système d'exploitation
 * Responsabilité : Fournir la bonne fabrique selon le système
 */
public class OSDetector {

    /**
     * Retourne la fabrique selon le nom du système
     */
    public static GUIFactory getFactoryByName(String osName) {
        return switch (osName.toUpperCase()) {
            case "WINDOWS" -> new WindowsFactory();
            case "LINUX" -> new LinuxFactory();
            default -> throw new IllegalArgumentException("OS non supporté: " + osName);
        };
    }
}
