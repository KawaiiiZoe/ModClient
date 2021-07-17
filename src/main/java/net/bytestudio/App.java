package net.bytestudio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {

    private static App instance;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        instance = this;
        Parent parent = FXMLLoader.load(Objects.requireNonNull(App.class.getResource("account/account.fxml")));
        stage.initStyle(StageStyle.TRANSPARENT);
        scene = new Scene(parent);

        scene.setFill(Color.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static App getInstance() {
        return instance;
    }

    public static Scene getScene() {
        return scene;
    }
}