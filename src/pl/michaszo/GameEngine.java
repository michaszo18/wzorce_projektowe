package pl.michaszo;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 123124;

    public int hp = 100;
    public String characterName = "Mike";
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public void run() {
        while (true) {
            //czekamy na ruch gracza
            //zmieniamy stan gry
            //renderujemy grafikę
        }
    }

    public static GameEngine getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
