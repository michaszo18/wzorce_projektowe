package pl.michaszo;

public class Main {

    public static void main(String[] args) {
	    GameEngine gameEngine = GameEngine.getInstance();

	    GameEngine gameEngine1 = GameEngine.getInstance();

        System.out.println(gameEngine == gameEngine1);
    }
}
