package in28minutes.learnspring.game;

public class GameRunner {

    MarioGame game;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);

        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
