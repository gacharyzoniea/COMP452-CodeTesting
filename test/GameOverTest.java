import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class GameOverTest {
    public class MockJPanel extends JPanel {
    }
    @Test
    void computerZeroGuess(){
        MockJPanel mockJPanel = new MockJPanel();
        GameOverPanel gameOverPanel = new GameOverPanel(mockJPanel);

        GameResult instantWin = new GameResult(false, 20, 0);
        assertEquals("I guessed it on the first try!", gameOverPanel.setUI(instantWin));
    }

    @Test
    void computerFirstGuess(){
        MockJPanel mockJPanel = new MockJPanel();
        GameOverPanel gameOverPanel = new GameOverPanel(mockJPanel);

        GameResult instantWin = new GameResult(false, 20, 1);
        assertEquals("I guessed it on the first try!", gameOverPanel.setUI(instantWin));
    }

    @Test
    void humanManyGuess(){
        MockJPanel mockJPanel = new MockJPanel();
        GameOverPanel gameOverPanel = new GameOverPanel(mockJPanel);

        GameResult instantWin = new GameResult(true, 20, 10002);
        assertEquals("It took you 10002 guesses.", gameOverPanel.setUI(instantWin));
    }

    @Test
    void humanZeroGuess(){
        MockJPanel mockJPanel = new MockJPanel();
        GameOverPanel gameOverPanel = new GameOverPanel(mockJPanel);

        GameResult instantWin = new GameResult(true, 20, 0);
        assertEquals("You guessed it on the first try!", gameOverPanel.setUI(instantWin));
    }

    @Test
    void humanFirstGuess(){
        MockJPanel mockJPanel = new MockJPanel();
        GameOverPanel gameOverPanel = new GameOverPanel(mockJPanel);

        GameResult instantWin = new GameResult(true, 20, 1);
        assertEquals("You guessed it on the first try!", gameOverPanel.setUI(instantWin));
    }



}
