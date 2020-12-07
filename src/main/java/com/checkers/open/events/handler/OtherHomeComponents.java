/**
 * Copyright 2020 Me u SoftwarePlus (meusoftwareplus.com)
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.events.handler;

import com.checkers.open.App;
import com.checkers.open.utils.BoardHandling;
import java.io.IOException;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class OtherHomeComponents implements EventHandler<MouseEvent> {

    Button startGameButton;
    Label blueScore, redScore;
    GridPane gameBoard;
    public static Label passBlueScore, passRedScore;

    public OtherHomeComponents(Button startGameButton, Label blueScore, Label redScore, GridPane gameBoard) {
        this.startGameButton = startGameButton;
        this.blueScore = blueScore;
        this.redScore = redScore;
        this.gameBoard = gameBoard;
    }

    public void otherComponentsHandler() {
        startGameButton.setOnMouseClicked(this);
        // set accessible score points
        passBlueScore = blueScore;
        passRedScore = redScore;
    }

    @Override
    public void handle(MouseEvent t) {
        if (t.getSource() == startGameButton) {
            if (startGameButton.getText().equals("START GAME")) {
                startGame();
            } else {
                stopGame();
            }
        }
    }

    private void startGame() {
        gameBoard.setDisable(false);
        startGameButton.setText("GAME STARTED");
    }

    private void stopGame() {
        try {
            App.setRoot("views/GameLevels");
        } catch (IOException out) {
            BoardHandling.writeErrors(out.getMessage());
        }
    }
}
