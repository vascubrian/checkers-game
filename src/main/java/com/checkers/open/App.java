/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("views/GameLevels"), 1000, 700);
        scene.getStylesheets().add(getClass().getResource("/css/home.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource("/css/components.css").toExternalForm());
        stage.setMinHeight(Double.MIN_VALUE);
        stage.setMinWidth(Double.MIN_VALUE);
        stage.setResizable(false);
        stage.getIcons().add(new Image("/images/checkers.logo.jpg"));
        stage.setTitle("Checkers");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
