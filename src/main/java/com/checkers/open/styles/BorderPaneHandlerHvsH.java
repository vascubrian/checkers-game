/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.styles;

import java.util.List;
import javafx.scene.layout.BorderPane;

public interface BorderPaneHandlerHvsH {

    void createBorderPane();

    void stylePanePlayer(BorderPane borderPane, String styleId);

    List<String> AllBoardPane();

    void clearBoardPane();

    void moveUtils(String passBoardPane);

    void unlockHumanNeighbours();

    void unlockHumanKingNeighbours(String boardPane);

    boolean isNodeNotEmpty(String nodeDepth);

    boolean isNodeHasEmptyDepth(String nodeDepth);

}
