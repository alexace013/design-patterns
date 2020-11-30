package book.creationDesignPatterns.factoryMethod.button;

import lombok.extern.log4j.Log4j;

@Log4j
public class HTMLButton implements IButton, IButtonText {

    private static final String HTML_BUTTON_TXT = "HTML";

    @Override
    public void render() {
        log.debug(String.format(RENDER_TXT, HTML_BUTTON_TXT));
    }

    @Override
    public void onClick(String action) {
        log.debug(String.format(ACTION_TXT, HTML_BUTTON_TXT));
    }
}