package book.creationDesignPatterns.abstractFactory.factory;

import book.creationDesignPatterns.abstractFactory.button.IButton;
import book.creationDesignPatterns.abstractFactory.checkbox.ICheckbox;

public interface GUIFactory {

    IButton createButton();

    ICheckbox creteCheckbox();
}