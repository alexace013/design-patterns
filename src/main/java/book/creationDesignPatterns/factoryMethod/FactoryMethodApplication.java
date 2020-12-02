package book.creationDesignPatterns.factoryMethod;

import book.creationDesignPatterns.factoryMethod.dialog.Dialog;
import book.creationDesignPatterns.factoryMethod.dialog.DialogException;
import book.creationDesignPatterns.factoryMethod.dialog.WebDialog;
import book.creationDesignPatterns.factoryMethod.dialog.WindowsDialog;

public class FactoryMethodApplication {

    private Dialog dialog;

    public static void main(String[] args) {
        FactoryMethodApplication application = new FactoryMethodApplication();
        try {
            application.initialize("Windows");
            application.dialog.render();
            application.initialize("HTML");
            application.dialog.render();
        } catch (DialogException ex) {
            ex.printStackTrace();
        }
    }

    public void initialize(String systemConfiguration) throws DialogException {
        if (systemConfiguration.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (systemConfiguration.equals("HTML")) {
            dialog = new WebDialog();
        } else {
            throw new DialogException("Unknown operation system!");
        }
    }
}