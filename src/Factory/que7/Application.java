package Factory.que7;

public class Application {
    public final Button button;
    public final Checkbox checkbox;
    public UIFactory factory;
    public Application(UIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void BuildTheme(){

        button.onClick();
        checkbox.checked();
    }
}
