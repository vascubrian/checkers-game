/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.events.handler;

import com.checkers.open.algorithm.EnableAlgorithmHandler;
import com.checkers.open.boardfunction.PanelFunction;
import com.checkers.open.utils.BoardHandling;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class BorderPaneListener implements EventHandler<MouseEvent> {

    BorderPane boardPane1, boardPane2, boardPane3, boardPane4, boardPane5, boardPane6, boardPane7, boardPane8, boardPane9, boardPane10;
    BorderPane boardPane11, boardPane12, boardPane13, boardPane14, boardPane15, boardPane16, boardPane17, boardPane18, boardPane19, boardPane20;
    BorderPane boardPane21, boardPane22, boardPane23, boardPane24, boardPane25, boardPane26, boardPane27, boardPane28, boardPane29, boardPane30;
    BorderPane boardPane31, boardPane32;

    private final PanelFunction panelFunction = new PanelFunction();

    private EnableAlgorithmHandler enableAlgorithmHandler;

    public BorderPaneListener(
            BorderPane boardPane1, BorderPane boardPane2, BorderPane boardPane3, BorderPane boardPane4, BorderPane boardPane5, BorderPane boardPane6, BorderPane boardPane7, BorderPane boardPane8, BorderPane boardPane9, BorderPane boardPane10,
            BorderPane boardPane11, BorderPane boardPane12, BorderPane boardPane13, BorderPane boardPane14, BorderPane boardPane15, BorderPane boardPane16, BorderPane boardPane17, BorderPane boardPane18, BorderPane boardPane19, BorderPane boardPane20,
            BorderPane boardPane21, BorderPane boardPane22, BorderPane boardPane23, BorderPane boardPane24, BorderPane boardPane25, BorderPane boardPane26, BorderPane boardPane27, BorderPane boardPane28, BorderPane boardPane29, BorderPane boardPane30,
            BorderPane boardPane31, BorderPane boardPane32) {

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
        // loading outside class methods
        panelFunction.StandingPanelStatus();
        panelFunction.StandingPlayerStatus();
        panelFunction.createComputerNeighbours();
        panelFunction.createHumanNeighbours();
        panelFunction.createComputerKings();
        panelFunction.createHumanKings();
        panelFunction.organiseKingNodeDepth();
        panelFunction.organiseNodeDepth();
        panelFunction.organiseComputerNodeDepth();
        enableAlgorithmHandler = new EnableAlgorithmHandler(panelFunction);
    }

    @Override
    public void handle(MouseEvent t) {
        if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane1")) && t.getSource() == boardPane1) {
            enableAlgorithmHandler.checkerMove("boardPane1");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane2")) && t.getSource() == boardPane2) {
            enableAlgorithmHandler.checkerMove("boardPane2");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane3")) && t.getSource() == boardPane3) {
            enableAlgorithmHandler.checkerMove("boardPane3");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane4")) && t.getSource() == boardPane4) {
            enableAlgorithmHandler.checkerMove("boardPane4");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane5")) && t.getSource() == boardPane5) {
            enableAlgorithmHandler.checkerMove("boardPane5");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane6")) && t.getSource() == boardPane6) {
            enableAlgorithmHandler.checkerMove("boardPane6");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane7")) && t.getSource() == boardPane7) {
            enableAlgorithmHandler.checkerMove("boardPane7");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane8")) && t.getSource() == boardPane8) {
            enableAlgorithmHandler.checkerMove("boardPane8");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane9")) && t.getSource() == boardPane9) {
            enableAlgorithmHandler.checkerMove("boardPane9");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane10")) && t.getSource() == boardPane10) {
            enableAlgorithmHandler.checkerMove("boardPane10");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane11")) && t.getSource() == boardPane11) {
            enableAlgorithmHandler.checkerMove("boardPane11");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane12")) && t.getSource() == boardPane12) {
            enableAlgorithmHandler.checkerMove("boardPane12");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane13")) && t.getSource() == boardPane13) {
            enableAlgorithmHandler.checkerMove("boardPane13");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane14")) && t.getSource() == boardPane14) {
            enableAlgorithmHandler.checkerMove("boardPane14");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane15")) && t.getSource() == boardPane15) {
            enableAlgorithmHandler.checkerMove("boardPane15");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane16")) && t.getSource() == boardPane16) {
            enableAlgorithmHandler.checkerMove("boardPane16");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane17")) && t.getSource() == boardPane17) {
            enableAlgorithmHandler.checkerMove("boardPane17");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane18")) && t.getSource() == boardPane18) {
            enableAlgorithmHandler.checkerMove("boardPane18");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane19")) && t.getSource() == boardPane19) {
            enableAlgorithmHandler.checkerMove("boardPane19");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane20")) && t.getSource() == boardPane20) {
            enableAlgorithmHandler.checkerMove("boardPane20");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane21")) && t.getSource() == boardPane21) {
            enableAlgorithmHandler.checkerMove("boardPane21");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane22")) && t.getSource() == boardPane22) {
            enableAlgorithmHandler.checkerMove("boardPane22");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane23")) && t.getSource() == boardPane23) {
            enableAlgorithmHandler.checkerMove("boardPane23");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane24")) && t.getSource() == boardPane24) {
            enableAlgorithmHandler.checkerMove("boardPane24");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane25")) && t.getSource() == boardPane25) {
            enableAlgorithmHandler.checkerMove("boardPane25");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane26")) && t.getSource() == boardPane26) {
            enableAlgorithmHandler.checkerMove("boardPane26");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane27")) && t.getSource() == boardPane27) {
            enableAlgorithmHandler.checkerMove("boardPane27");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane28")) && t.getSource() == boardPane28) {
            enableAlgorithmHandler.checkerMove("boardPane28");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane29")) && t.getSource() == boardPane29) {
            enableAlgorithmHandler.checkerMove("boardPane29");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane30")) && t.getSource() == boardPane30) {
            enableAlgorithmHandler.checkerMove("boardPane30");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane31")) && t.getSource() == boardPane31) {
            enableAlgorithmHandler.checkerMove("boardPane31");
        } else if (BoardHandling.acceptClick(panelFunction.getPlayerStatus("boardPane32")) && t.getSource() == boardPane32) {
            enableAlgorithmHandler.checkerMove("boardPane32");
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
}
