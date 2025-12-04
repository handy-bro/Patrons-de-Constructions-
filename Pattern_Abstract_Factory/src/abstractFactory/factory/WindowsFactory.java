package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.button.WindowsButton;
import abstractFactory.checkbox.Checkbox;
import abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
