package net.bytestudio;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static App instance;

    @Override
    public void start(Stage stage) throws IOException {
        instance = this;
        StageManager stageManager = new StageManager(stage);
        stageManager.changeScene(0);
        stageManager.showStage();
    }

    public static void main(String[] args) {
        launch();
    }

    public static App getInstance() {
        return instance;
    }
}