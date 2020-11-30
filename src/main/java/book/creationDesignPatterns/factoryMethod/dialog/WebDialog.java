package book.creationDesignPatterns.factoryMethod.dialog;

import book.creationDesignPatterns.factoryMethod.button.HTMLButton;
import book.creationDesignPatterns.factoryMethod.button.IButton;

public class WebDialog extends Dialog {

    @Override
    IButton createButton() {
        return new HTMLButton();
    }
}