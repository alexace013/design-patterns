package book.creationDesignPatterns.abstractFactory.checkbox;

import lombok.extern.log4j.Log4j;

@Log4j
public class MacCheckbox implements ICheckbox {

    @Override
    public void paint() {
        log.debug("Paint a Mac checkbox.");
    }
}