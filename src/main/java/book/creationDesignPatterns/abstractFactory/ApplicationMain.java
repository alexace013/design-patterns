package book.creationDesignPatterns.abstractFactory;

import book.creationDesignPatterns.abstractFactory.factory.GUIFactory;
import book.creationDesignPatterns.abstractFactory.factory.MacFactory;
import book.creationDesignPatterns.abstractFactory.factory.WindowsFactory;
import lombok.extern.log4j.Log4j;

@Log4j
public class ApplicationMain {

    public static void main(String[] args) {
        try {
            Application windowsApp = new Application(createFactory("Windows"));
            windowsApp.createUI();
            windowsApp.paint();
            Application macApp = new Application(createFactory("Mac"));
            macApp.createUI();
            macApp.paint();
            Application testApp = new Application(createFactory("Test"));
        } catch (AbstractFactoryException ex) {
            log.error(ex.getMessage());
        }
    }

    public static GUIFactory createFactory(String osConfig) throws AbstractFactoryException {
        if (osConfig.equals("Windows")) {
            return new WindowsFactory();
        } else if ((osConfig.equals("Mac"))) {
            return new MacFactory();
        } else {
            throw new AbstractFactoryException("Unknown operating system!");
        }
    }
}