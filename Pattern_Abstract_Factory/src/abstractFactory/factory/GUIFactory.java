package abstractFactory.factory;

import abstractFactory.button.Button;
import abstractFactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
