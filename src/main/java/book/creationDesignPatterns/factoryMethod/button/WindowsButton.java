package book.creationDesignPatterns.factoryMethod.button;

import lombok.extern.log4j.Log4j;

@Log4j
public class WindowsButton implements IButton, IButtonText {

    private static final String WINDOWS_BUTTON_TXT = "Windows";

    @Override
    public void render() {
        log.debug(String.format(RENDER_TXT, WINDOWS_BUTTON_TXT));
    }

    @Override
    public void onClick(String action) {
        log.debug(String.format(ACTION_TXT, WINDOWS_BUTTON_TXT));
    }
}