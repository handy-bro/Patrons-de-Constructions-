package abstractFactory.button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("[Linux Button] Bouton arrondi élégant");
    }

    @Override
    public void onClick() {
        System.out.println("Clic Linux: Animation fluide");
    }
}
