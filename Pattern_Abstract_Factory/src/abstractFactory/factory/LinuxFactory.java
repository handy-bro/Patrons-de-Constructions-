package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.button.LinuxButton;
import abstractFactory.checkbox.Checkbox;
import abstractFactory.checkbox.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
