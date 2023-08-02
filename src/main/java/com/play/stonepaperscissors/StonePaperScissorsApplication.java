package com.play.stonepaperscissors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class StonePaperScissorsApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent layout = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/play/view/play-view.fxml")));

        primaryStage.setTitle("Stone-Paper-Scissors");
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }
}