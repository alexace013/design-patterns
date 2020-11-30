package book.creationDesignPatterns.factoryMethod.dialog;

import book.creationDesignPatterns.factoryMethod.button.IButton;
import book.creationDesignPatterns.factoryMethod.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    IButton createButton() {
        return new WindowsButton();
    }
}