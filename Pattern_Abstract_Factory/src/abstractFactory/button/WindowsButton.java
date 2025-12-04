package abstractFactory.button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("[Windows Button] Bouton rectangulaire bleu");
    }

    @Override
    public void onClick() {
        System.out.println("Clic Windows: Effet de brillance");
    }
}
