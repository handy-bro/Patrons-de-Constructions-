import abstractFactory.client.Application;
import abstractFactory.factory.GUIFactory;
import abstractFactory.util.OSDetector;

public class Main {
    public static void main(String[] args) {

        // Test avec différentes plateformes
        String[] platforms = {"WINDOWS", "LINUX"};

        for (String platform : platforms) {
            System.out.println("INTERFACE POUR " + platform);
            GUIFactory factory = OSDetector.getFactoryByName(platform);
            Application app = new Application(factory);
            app.render();
            app.interact();

            if (!platform.equals("LINUX")) {
                System.out.println("\n" + "─".repeat(55) + "\n");
            }
        }

    }
}