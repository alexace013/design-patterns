package book.creationDesignPatterns.factoryMethod.dialog;

import book.creationDesignPatterns.factoryMethod.button.IButton;

public abstract class Dialog {

    public void render() {
        IButton button = createButton();
        button.onClick("Close dialog.");
        button.render();
    }

    abstract IButton createButton();
}