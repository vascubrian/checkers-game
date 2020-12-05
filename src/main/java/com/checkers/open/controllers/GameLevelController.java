/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.controllers;

import com.checkers.open.App;
import com.checkers.open.enumeration.GameLevel;
import com.checkers.open.model.Singleton;
import com.checkers.open.utils.BoardHandling;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class GameLevelController implements Initializable, EventHandler<MouseEvent> {

    @FXML
    private Button onePlayer, twoPlayers, viewRules;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        onePlayer.setOnMousePressed(this);
        twoPlayers.setOnMousePressed(this);
        viewRules.setOnMousePressed(this);
    }

    @Override
    public void handle(MouseEvent t) {
        if (t.getSource() == onePlayer) {
            Singleton.getInstance().setGameLevel(GameLevel.ONEPLAYER.getGameLevel());
            loadFmxl("HomeView");

        } else if (t.getSource() == twoPlayers) {

            Singleton.getInstance().setGameLevel(GameLevel.TWOPLAYERS.getGameLevel());
            loadFmxl("HomeView");
        } else if (t.getSource() == viewRules) {

            loadFmxl("RulesView");
        }
    }

    private void loadFmxl(String fmxlFile) {
        //reset panel
        try {
            App.setRoot("views/" + fmxlFile);
        } catch (IOException out) {
            BoardHandling.writeErrors(out.getMessage());
        }
    }
}
