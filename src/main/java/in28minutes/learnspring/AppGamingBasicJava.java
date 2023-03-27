package in28minutes.learnspring;

import in28minutes.learnspring.game.GameRunner;
import in28minutes.learnspring.game.MarioGame;

public class AppGamingBasicJava {
    public static  void main(String[] args)
    {
        var marioGame = new MarioGame();
        var gameRunner =  new GameRunner(marioGame);
        gameRunner.run();
    }
}
