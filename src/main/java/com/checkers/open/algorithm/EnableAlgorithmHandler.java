/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.algorithm;

import com.checkers.open.App;
import com.checkers.open.boardfunction.PanelFunction;
import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.enumeration.PanelFlag;
import com.checkers.open.model.Singleton;
import com.checkers.open.styles.enableBorderPaneHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class EnableAlgorithmHandler extends PanelFunction implements AlgorithmHandler {

    private final PanelFunction panelFunction;

    public EnableAlgorithmHandler(PanelFunction panelFunction) {
        this.panelFunction = panelFunction;
    }

    @Override
    public void checkerMove(String boardPane) {
        if (panelFunction.getPanelStatus(boardPane).equals(PanelFlag.MOVE.getPaneStaus())) {
            startScoreJourney(boardPane);
        } else {
            panelFunction.getHumanNeighbours(boardPane).forEach((neighbours) -> {
                String checkStartCore = panelFunction.getScoreNode(boardPane, neighbours);
                if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.LOCKED.getPaneStaus()) && panelFunction.getPlayerStatus(neighbours).equals(GamePlayer.COMPUTER.getPlayerFlag()) && !"".equals(checkStartCore)) {

                    styleRedirectHandler(boardPane, neighbours);
                    // set score flag
                    Singleton.getInstance().setFlagNode(neighbours);
                    Singleton.getInstance().setScoreFlag(checkStartCore);

                }
            });
        }
    }

    @Override
    public void startScoreJourney(String parentBoardPane) {
        panelFunction.getHumanNeighbours(parentBoardPane).forEach((neighbours) -> {
            String checkStartCore = panelFunction.getScoreNode(parentBoardPane, neighbours);
            if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.LOCKED.getPaneStaus()) && panelFunction.getPlayerStatus(neighbours).equals(GamePlayer.COMPUTER.getPlayerFlag()) && !"".equals(checkStartCore)) {

                styleRedirectHandler(parentBoardPane, neighbours);
                // set score flag
                Singleton.getInstance().setFlagNode(neighbours);
                Singleton.getInstance().setScoreFlag(checkStartCore);

            } else {
                if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                    styleRedirectHandler(parentBoardPane, neighbours);
                }
            }
        });
    }

    @Override
    public void styleRedirectHandler(String parentBoardPane, String neighbourboardPane) {
        Scene scene = App.scene;
        BorderPane nodeToFind = (BorderPane) scene.lookup("#" + neighbourboardPane + "");
        new enableBorderPaneHandler(nodeToFind, parentBoardPane, panelFunction).createBorderPane();
    }
}
