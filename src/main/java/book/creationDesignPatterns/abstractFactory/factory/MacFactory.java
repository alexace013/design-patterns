package book.creationDesignPatterns.abstractFactory.factory;

import book.creationDesignPatterns.abstractFactory.button.IButton;
import book.creationDesignPatterns.abstractFactory.button.MacButton;
import book.creationDesignPatterns.abstractFactory.checkbox.ICheckbox;
import book.creationDesignPatterns.abstractFactory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox creteCheckbox() {
        return new MacCheckbox();
    }
}