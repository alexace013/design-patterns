package book.creationDesignPatterns.factoryMethod;

import book.creationDesignPatterns.factoryMethod.dialog.Dialog;
import book.creationDesignPatterns.factoryMethod.dialog.DialogException;
import book.creationDesignPatterns.factoryMethod.dialog.WebDialog;
import book.creationDesignPatterns.factoryMethod.dialog.WindowsDialog;

public class FactoryMethodApplication {

    private Dialog dialog;
    private static final String SYSTEM_CONF_WINDOWS = "Windows";
    private static final String SYSTEM_CONF_HTML = "HTML";

    public static void main(String[] args) {
        FactoryMethodApplication application = new FactoryMethodApplication();
        try {
            application.initialize(SYSTEM_CONF_WINDOWS);
            application.dialog.render();
        } catch (DialogException ex) {
            ex.printStackTrace();
        }
    }

    public void initialize(String systemConfiguration) throws DialogException {
        if (systemConfiguration.equals(SYSTEM_CONF_WINDOWS)) {
            dialog = new WindowsDialog();
        } else if (systemConfiguration.equals(SYSTEM_CONF_HTML)) {
            dialog = new WebDialog();
        } else {
            throw new DialogException("Unknown operation system!");
        }
    }
}