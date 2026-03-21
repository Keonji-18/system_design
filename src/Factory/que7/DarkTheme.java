package Factory.que7;

public class DarkTheme implements UIFactory{

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new DarkCheckbox();
        }

}

