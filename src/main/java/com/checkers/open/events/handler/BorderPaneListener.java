/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.events.handler;

import com.checkers.open.algorithm.EnableAlgorithmHandler;
import com.checkers.open.algorithm.EnableAlgorithmHandlerHvsH;
import com.checkers.open.boardfunction.PanelFunction;
import com.checkers.open.boardfunction.PanelFunctionHvsH;
import com.checkers.open.enumeration.GameLevel;
import com.checkers.open.model.Singleton;
import com.checkers.open.utils.BoardHandling;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class BorderPaneListener implements EventHandler<MouseEvent> {

    BorderPane boardPane1, boardPane2, boardPane3, boardPane4, boardPane5, boardPane6, boardPane7, boardPane8, boardPane9, boardPane10;
    BorderPane boardPane11, boardPane12, boardPane13, boardPane14, boardPane15, boardPane16, boardPane17, boardPane18, boardPane19, boardPane20;
    BorderPane boardPane21, boardPane22, boardPane23, boardPane24, boardPane25, boardPane26, boardPane27, boardPane28, boardPane29, boardPane30;
    BorderPane boardPane31, boardPane32;

    private PanelFunction panelFunction;
    private PanelFunctionHvsH panelFunctionHvsH;
    private EnableAlgorithmHandler enableAlgorithmHandler;
    private EnableAlgorithmHandlerHvsH enableAlgorithmHandlerHvsH;

    public BorderPaneListener(BorderPane boardPane1, BorderPane boardPane2, BorderPane boardPane3, BorderPane boardPane4, BorderPane boardPane5, BorderPane boardPane6, BorderPane boardPane7, BorderPane boardPane8, BorderPane boardPane9, BorderPane boardPane10, BorderPane boardPane11, BorderPane boardPane12, BorderPane boardPane13, BorderPane boardPane14, BorderPane boardPane15, BorderPane boardPane16, BorderPane boardPane17, BorderPane boardPane18, BorderPane boardPane19, BorderPane boardPane20, BorderPane boardPane21, BorderPane boardPane22, BorderPane boardPane23, BorderPane boardPane24, BorderPane boardPane25, BorderPane boardPane26, BorderPane boardPane27, BorderPane boardPane28, BorderPane boardPane29, BorderPane boardPane30, BorderPane boardPane31, BorderPane boardPane32) {
        this.boardPane1 = boardPane1;
        this.boardPane2 = boardPane2;
        this.boardPane3 = boardPane3;
        this.boardPane4 = boardPane4;
        this.boardPane5 = boardPane5;
        this.boardPane6 = boardPane6;
        this.boardPane7 = boardPane7;
        this.boardPane8 = boardPane8;
        this.boardPane9 = boardPane9;
        this.boardPane10 = boardPane10;
        this.boardPane11 = boardPane11;
        this.boardPane12 = boardPane12;
        this.boardPane13 = boardPane13;
        this.boardPane14 = boardPane14;
        this.boardPane15 = boardPane15;
        this.boardPane16 = boardPane16;
        this.boardPane17 = boardPane17;
        this.boardPane18 = boardPane18;
        this.boardPane19 = boardPane19;
        this.boardPane20 = boardPane20;
        this.boardPane21 = boardPane21;
        this.boardPane22 = boardPane22;
        this.boardPane23 = boardPane23;
        this.boardPane24 = boardPane24;
        this.boardPane25 = boardPane25;
        this.boardPane26 = boardPane26;
        this.boardPane27 = boardPane27;
        this.boardPane28 = boardPane28;
        this.boardPane29 = boardPane29;
        this.boardPane30 = boardPane30;
        this.boardPane31 = boardPane31;
        this.boardPane32 = boardPane32;
    }

    public void eventHandler() {
        // setting listeners
        loadListeners();
        // load panel status based on the game level
        if (Singleton.getInstance().getGameLevel().equals(GameLevel.TWOHUMANPLAYER.getGameLevel())) {
            panelFunctionHvsH = new PanelFunctionHvsH();
            panelFunctionHvsH.humanStandingPanelStatus();
            panelFunctionHvsH.humanStandingPlayerStatus();
            // load other board methods
            panelFunctionHvsH.createComputerNeighbours();
            panelFunctionHvsH.createHumanNeighbours();
            panelFunctionHvsH.createComputerKings();
            panelFunctionHvsH.createHumanKings();
            panelFunctionHvsH.organiseKingNodeDepth();
            panelFunctionHvsH.organiseNodeDepth();
            panelFunctionHvsH.organiseComputerNodeDepth();
            enableAlgorithmHandlerHvsH = new EnableAlgorithmHandlerHvsH(panelFunctionHvsH);
        } else {
            panelFunction = new PanelFunction();
            panelFunction.StandingPanelStatus();
            panelFunction.StandingPlayerStatus();
            // load other board methods
            panelFunction.createComputerNeighbours();
            panelFunction.createHumanNeighbours();
            panelFunction.createComputerKings();
            panelFunction.createHumanKings();
            panelFunction.organiseKingNodeDepth();
            panelFunction.organiseNodeDepth();
            panelFunction.organiseComputerNodeDepth();
            enableAlgorithmHandler = new EnableAlgorithmHandler(panelFunction);
        }
    }

    @Override
    public void handle(MouseEvent t) {
        // clickedBorderPane
        BorderPane clickedBorderPane = (BorderPane) t.getSource();
        if (acceptClick(clickedBorderPane.getId()) && t.getSource() == clickedBorderPane) {
            handleGameLevelInitMove(clickedBorderPane.getId());
        }
    }

    private void loadListeners() {
        boardPane1.setOnMouseClicked(this);
        boardPane2.setOnMouseClicked(this);
        boardPane3.setOnMouseClicked(this);
        boardPane4.setOnMouseClicked(this);
        boardPane5.setOnMouseClicked(this);
        boardPane6.setOnMouseClicked(this);
        boardPane7.setOnMouseClicked(this);
        boardPane8.setOnMouseClicked(this);
        boardPane9.setOnMouseClicked(this);
        boardPane10.setOnMouseClicked(this);
        boardPane11.setOnMouseClicked(this);
        boardPane12.setOnMouseClicked(this);
        boardPane13.setOnMouseClicked(this);
        boardPane14.setOnMouseClicked(this);
        boardPane15.setOnMouseClicked(this);
        boardPane16.setOnMouseClicked(this);
        boardPane17.setOnMouseClicked(this);
        boardPane18.setOnMouseClicked(this);
        boardPane19.setOnMouseClicked(this);
        boardPane20.setOnMouseClicked(this);
        boardPane21.setOnMouseClicked(this);
        boardPane22.setOnMouseClicked(this);
        boardPane23.setOnMouseClicked(this);
        boardPane24.setOnMouseClicked(this);
        boardPane25.setOnMouseClicked(this);
        boardPane26.setOnMouseClicked(this);
        boardPane27.setOnMouseClicked(this);
        boardPane28.setOnMouseClicked(this);
        boardPane29.setOnMouseClicked(this);
        boardPane30.setOnMouseClicked(this);
        boardPane31.setOnMouseClicked(this);
        boardPane32.setOnMouseClicked(this);
    }

    private void handleGameLevelInitMove(String boardPane) {
        if (Singleton.getInstance().getGameLevel().equals(GameLevel.TWOHUMANPLAYER.getGameLevel())) {
            enableAlgorithmHandlerHvsH.checkerMove(boardPane);
        } else {
            enableAlgorithmHandler.checkerMove(boardPane);
        }
    }

    private boolean acceptClick(String boardPane) {
        if (Singleton.getInstance().getGameLevel().equals(GameLevel.TWOHUMANPLAYER.getGameLevel())) {
            return BoardHandling.acceptClick(panelFunctionHvsH.getPlayerStatus(boardPane));
        } else {
            return BoardHandling.acceptClick(panelFunction.getPlayerStatus(boardPane));
        }
    }
}
