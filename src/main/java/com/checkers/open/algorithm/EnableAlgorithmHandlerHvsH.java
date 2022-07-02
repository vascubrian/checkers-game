package com.checkers.open.algorithm;

import com.checkers.open.App;
import com.checkers.open.boardfunction.PanelFunctionHvsH;
import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.enumeration.PanelFlag;
import com.checkers.open.model.Singleton;
import com.checkers.open.styles.enableBorderPaneHandlerHvsH;
import com.checkers.open.utils.BoardHandling;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.util.List;

public class EnableAlgorithmHandlerHvsH extends PanelFunctionHvsH implements AlgorithmHandler {

    private final PanelFunctionHvsH panelFunction;
    private List<String> boardNeighbours = null;
    private String scorePlayer = "", checkStartCore = "";
    public EnableAlgorithmHandlerHvsH(PanelFunctionHvsH panelFunction) {
        this.panelFunction = panelFunction;
    }

    @Override
    public void checkerMove(String boardPane) {
        if (panelFunction.getPanelStatus(boardPane).equals(PanelFlag.MOVE.getPaneStaus())) {
            startScoreJourney(boardPane);
        } else {
            // handle two human players , select board panel neighbours
            if (panelFunction.getPlayerStatus(boardPane).equals(GamePlayer.HUMAN_TWO.getPlayerFlag()) || panelFunction.getPlayerStatus(boardPane).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag())) {
                boardNeighbours = panelFunction.getComputerNeighbours(boardPane);
                scorePlayer = GamePlayer.HUMAN_ONE.getPlayerFlag();
            } else {
                boardNeighbours = panelFunction.getHumanNeighbours(boardPane);
                scorePlayer = GamePlayer.HUMAN_TWO.getPlayerFlag();
            }
            boardNeighbours.forEach((neighbours) -> {
                // check score node first
                checkStartCore = panelFunction.getPlayerStatus(neighbours).equals(scorePlayer) ? panelFunction.getScoreNode(boardPane, neighbours, panelFunction.getPlayerStatus(boardPane)) : "";
                if (!"".equals(checkStartCore)) {
                    BoardHandling.enableHighlightedNodes(checkStartCore, boardPane, panelFunction);
                    Singleton.getInstance().setScoreFlag(checkStartCore);
                    Singleton.getInstance().setFlagNode(neighbours);
                } else {
                    if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                        styleRedirectHandler(boardPane, neighbours);
                    }
                }
            });
        }
    }

    @Override
    public void startScoreJourney(String parentBoardPane) {
        if (panelFunction.getPlayerStatus(parentBoardPane).equals(GamePlayer.HUMAN_TWO.getPlayerFlag()) || panelFunction.getPlayerStatus(parentBoardPane).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag())) {
            boardNeighbours = panelFunction.getComputerNeighbours(parentBoardPane);
            scorePlayer = GamePlayer.HUMAN_ONE.getPlayerFlag();
        } else {
            scorePlayer = GamePlayer.HUMAN_TWO.getPlayerFlag();
            boardNeighbours = panelFunction.getHumanNeighbours(parentBoardPane);
        }
        boardNeighbours.forEach((neighbours) -> {
            // check score node first
            checkStartCore = panelFunction.getPlayerStatus(neighbours).equals(scorePlayer) ? panelFunction.getScoreNode(parentBoardPane, neighbours, panelFunction.getPlayerStatus(parentBoardPane)) : "";
            if (!"".equals(checkStartCore)) {
                BoardHandling.enableHighlightedNodes(checkStartCore, parentBoardPane, panelFunction);
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
        new enableBorderPaneHandlerHvsH(nodeToFind, parentBoardPane, panelFunction).createBorderPane();
    }
}
