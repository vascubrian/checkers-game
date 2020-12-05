/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.controllers;

import com.checkers.open.App;
import com.checkers.open.utils.BoardHandling;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ViewRulesController implements Initializable, EventHandler<MouseEvent> {

    @FXML
    private Button switchHome;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        switchHome.setOnMousePressed(this);
    }

    @Override
    public void handle(MouseEvent t) {
        if (t.getSource() == switchHome) {
            //reset panel
            try {
                App.setRoot("views/GameLevels");
            } catch (IOException out) {
                BoardHandling.writeErrors(out.getMessage());
            }
        }
    }

}
