package book.creationDesignPatterns.factoryMethod.button;

import lombok.extern.log4j.Log4j;

@Log4j
public class HTMLButton implements IButton {

    @Override
    public void render() {
        log.debug("Render a HTML button.");
    }

    @Override
    public void onClick(String action) {
        log.debug("Click on HTML button.");
    }
}