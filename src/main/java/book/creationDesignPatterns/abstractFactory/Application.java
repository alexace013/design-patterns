package book.creationDesignPatterns.abstractFactory;

import book.creationDesignPatterns.abstractFactory.button.IButton;
import book.creationDesignPatterns.abstractFactory.checkbox.ICheckbox;
import book.creationDesignPatterns.abstractFactory.factory.GUIFactory;

public class Application {

    private GUIFactory factory;
    private IButton button;
    private ICheckbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.creteCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}