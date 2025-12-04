package abstractFactory.checkbox;

public class LinuxCheckbox implements Checkbox {

    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[Linux Checkbox] Case simple");
    }

    @Override
    public boolean isChecked() {
        return checked;
    }
}
