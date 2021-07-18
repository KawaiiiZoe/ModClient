package net.bytestudio.scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public abstract class IScene {

    protected String name;
    protected int sceneID;
    protected String resource;

    private Scene scene;

    public IScene(String name, int sceneID, String resource) {
        this.name = name;
        this.sceneID = sceneID;
        this.resource = resource;
    }

    public void initialize() {
        try {
            Parent parent = FXMLLoader.load(Objects.requireNonNull(IScene.class.getResource(resource)));
            scene = new Scene(parent);
            scene.setFill(Color.TRANSPARENT);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void display(Stage stage) {
        stage.setScene(scene);
    }

    public void show() {

    }

    public void hide() {

    }

    public Scene getScene() {
        return scene;
    }
}
