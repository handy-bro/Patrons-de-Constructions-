package abstractFactory.client;

import abstractFactory.button.Button;
import abstractFactory.checkbox.Checkbox;
import abstractFactory.factory.GUIFactory;

/**
 * Client qui utilise la fabrique abstraite
 * Responsabilité : Utiliser les composants GUI sans connaître leur implémentation
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        System.out.println("********** Rendu de l'interface **********");

        button.render();
        checkbox.render();
    }

    public void interact() {
        System.out.println("\n[Interactions utilisateur]");
        button.onClick();
        System.out.println("  → Case cochée: " + checkbox.isChecked());
    }
}

