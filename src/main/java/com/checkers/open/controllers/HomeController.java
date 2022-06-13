/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.controllers;

import com.checkers.open.events.handler.BorderPaneListener;
import com.checkers.open.events.handler.OtherHomeComponents;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class HomeController implements Initializable {

    private @FXML
    BorderPane boardPane1, boardPane2, boardPane3, boardPane4, boardPane5, boardPane6, boardPane7, boardPane8, boardPane9, boardPane10;
    private @FXML
    BorderPane boardPane11, boardPane12, boardPane13, boardPane14, boardPane15, boardPane16, boardPane17, boardPane18, boardPane19, boardPane20;
    private @FXML
    BorderPane boardPane21, boardPane22, boardPane23, boardPane24, boardPane25, boardPane26, boardPane27, boardPane28, boardPane29, boardPane30;
    private @FXML
    BorderPane boardPane31, boardPane32;
    private @FXML
    Button startGameButton;
    private @FXML
    Label blueScore, redScore;
    private @FXML
    GridPane gameBoard;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // loading events
        new BorderPaneListener(
                boardPane1, boardPane2, boardPane3, boardPane4, boardPane5, boardPane6, boardPane7, boardPane8, boardPane9, boardPane10,
                boardPane11, boardPane12, boardPane13, boardPane14, boardPane15, boardPane16, boardPane17, boardPane18, boardPane19, boardPane20,
                boardPane21, boardPane22, boardPane23, boardPane24, boardPane25, boardPane26, boardPane27, boardPane28, boardPane29, boardPane30,
                boardPane31, boardPane32).eventHandler();

        new OtherHomeComponents(startGameButton, blueScore, redScore, gameBoard).otherComponentsHandler();

    }
}
