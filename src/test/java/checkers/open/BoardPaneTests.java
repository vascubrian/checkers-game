/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package checkers.open;

import com.checkers.open.boardfunction.PanelFunction;
import com.checkers.open.enumeration.PanelFlag;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mac
 */
public class BoardPaneTests {

    PanelFunction panelFunction = new PanelFunction();

    public BoardPaneTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        panelFunction.StandingPanelStatus();
        panelFunction.StandingPlayerStatus();
        panelFunction.organiseKingNodeDepth();
        panelFunction.organiseNodeDepth();
        panelFunction.createHumanNeighbours();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testBoardPaneStatus() {
        assertEquals(panelFunction.getPanelStatus("boardPane18"), PanelFlag.EMPTY.getPaneStaus());
        assertEquals(panelFunction.getPanelStatus("boardPane32"), PanelFlag.LOCKED.getPaneStaus());
    }

    @Test
    public void testHumanNeighbours() {
        String[] passedNeighbours = {"boardPane14", "boardPane13"};
        assertEquals(panelFunction.getHumanNeighbours("boardPane17"), Arrays.asList(passedNeighbours));
    }
}
