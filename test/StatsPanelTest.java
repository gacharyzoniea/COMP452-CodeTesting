import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
public class StatsPanelTest {

    private class MockJPanel extends JPanel {
    }


    @Test
    void makeLabelTest(){
        MockJPanel mockJPanel = new MockJPanel();
        StatsPanel statsPanel = new StatsPanel(mockJPanel);
        assertEquals("[1, --, 2-3, --, 4-5, --, 6-7, --, 8-9, --, 10-11, --, 12-13, --, 14 or more, --]",
                statsPanel.makeLabel().toString());
    }

    

}
