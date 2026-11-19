package model;

import view.ViewListener;

public class Model {
    private GameManager gameManager;

    public Model(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
