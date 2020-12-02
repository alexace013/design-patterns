package book.creationDesignPatterns.abstractFactory.factory;

import book.creationDesignPatterns.abstractFactory.button.IButton;
import book.creationDesignPatterns.abstractFactory.button.WindowsButton;
import book.creationDesignPatterns.abstractFactory.checkbox.ICheckbox;
import book.creationDesignPatterns.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox creteCheckbox() {
        return new WindowsCheckbox();
    }
}