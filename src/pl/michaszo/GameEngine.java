package pl.michaszo;

public class GameEngine {

    public int hp = 100;
    public String characterName = "Mike";
    private static GameEngine instance;

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
        if (instance == null) {
            synchronized (GameEngine.class) {
                instance = new GameEngine();
            }
        }
        return instance;
    }
}
