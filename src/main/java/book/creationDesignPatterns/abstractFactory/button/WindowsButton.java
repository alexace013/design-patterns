package book.creationDesignPatterns.abstractFactory.button;

import lombok.extern.log4j.Log4j;

@Log4j
public class WindowsButton implements IButton {

    @Override
    public void paint() {
        log.debug("Paint a Windows button.");
    }
}