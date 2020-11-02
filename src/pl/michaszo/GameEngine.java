package pl.michaszo;

public class GameEngine {

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
}
