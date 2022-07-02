/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.utils;

import com.checkers.open.App;
import com.checkers.open.boardfunction.PanelFunctionHvsH;
import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.styles.enableBorderPaneHandlerHvsH;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public abstract class BoardHandling {

    public static void writeErrors(String message) {
        try {
            try (PrintWriter writer = new PrintWriter("error.txt")) {
                writer.write(message);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BoardHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean acceptClick(String gamePlayerFlag) {
        return gamePlayerFlag.equals(GamePlayer.HUMAN.getPlayerFlag()) || gamePlayerFlag.equals(GamePlayer.HUMANKING.getPlayerFlag()) || gamePlayerFlag.equals(GamePlayer.HUMAN_ONE.getPlayerFlag()) || gamePlayerFlag.equals(GamePlayer.HUMAN_TWO.getPlayerFlag()) || gamePlayerFlag.equals(GamePlayer.HUMAN_ONE_KING.getPlayerFlag()) || gamePlayerFlag.equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag());
    }

    public static void enableHighlightedNodes(String specifiedNode, String passBoardPane, PanelFunctionHvsH panelFunction) {
        Scene scene = App.scene;
        BorderPane nodeToFind = (BorderPane) scene.lookup("#" + specifiedNode + "");
        new enableBorderPaneHandlerHvsH(nodeToFind, passBoardPane, panelFunction).createBorderPane();
    }
}
