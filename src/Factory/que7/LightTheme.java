package Factory.que7;

public class LightTheme implements UIFactory{

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckBox();
    }
}
