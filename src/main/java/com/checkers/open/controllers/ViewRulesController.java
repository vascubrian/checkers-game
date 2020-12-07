/**
 * Copyright 2020 Me u SoftwarePlus (meusoftwareplus.com)
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
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
