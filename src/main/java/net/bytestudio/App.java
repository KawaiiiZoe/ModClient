package net.bytestudio;

import javafx.application.Application;
import javafx.stage.Stage;
import net.bytestudio.editor.ModConfigReader;

import java.io.IOException;

public class App extends Application {

    private static App instance;
    private static StageManager manager;

    @Override
    public void start(Stage stage) throws IOException {
        instance = this;
        ModConfigReader reader = new ModConfigReader("appleskin-client.toml");
        reader.printRawText();
        manager = new StageManager(stage);
        manager.changeScene(0);
        manager.showStage();
    }

    public static void main(String[] args) {
        launch();
    }

    public static App getInstance() {
        return instance;
    }

    public static StageManager getManager() {
        return manager;
    }
}