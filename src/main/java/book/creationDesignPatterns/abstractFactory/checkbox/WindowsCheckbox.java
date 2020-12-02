package book.creationDesignPatterns.abstractFactory.checkbox;

import lombok.extern.log4j.Log4j;

@Log4j
public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        log.debug("Paint a Windows checkbox.");
    }
}