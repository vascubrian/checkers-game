/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.styles;

import java.util.List;
import javafx.scene.layout.BorderPane;

public interface BorderPaneHandler {

    void createBorderPane();

    void stylePanePlayer(BorderPane borderPane, String styleId);

    List<String> AllBoardPane();

    void clearBoardPane();

    void moveUtils(String passBoardPane);

    void unlockHumanNeighbours();

    void unlockHumanKingNeighbours(String boardPane);

    void createComputerMove(String passBoardPane);

    void executeComputerMove(String boardPane);

    void randomComputerMove(String boardPane);

    boolean isNodeNotEmpty(String nodeDepth);

    boolean isNodeHasEmptyDepth(String nodeDepth);

}
