package abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox {

    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[Windows Checkbox] Case carrée avec coche");
    }

    @Override
    public boolean isChecked() {
        return checked;
    }
}
