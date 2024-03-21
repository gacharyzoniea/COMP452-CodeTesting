import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HumanGuessesGameTest {

    @Test
    void test(){
        HumanGuessesGame game = new HumanGuessesGame();
        game.makeGuess(50);
        assertEquals(1, game.getNumGuesses());
    }

    @Test
    void makeGuessTest(){
        HumanGuessesGame game = new HumanGuessesGame();
        assertEquals(GuessResult.HIGH, game.makeGuess(1001));
        assertEquals(GuessResult.LOW, game.makeGuess(0));
    }

    @Test
    void correctGuessTest(){
        HumanGuessesGame game = new HumanGuessesGame(5);
        assertEquals(GuessResult.CORRECT, game.makeGuess(5));
    }








}
