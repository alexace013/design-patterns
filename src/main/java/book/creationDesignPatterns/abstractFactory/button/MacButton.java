package book.creationDesignPatterns.abstractFactory.button;

import lombok.extern.log4j.Log4j;

@Log4j
public class MacButton implements IButton {

    @Override
    public void paint() {
        log.debug("Paint a Mac button.");
    }
}