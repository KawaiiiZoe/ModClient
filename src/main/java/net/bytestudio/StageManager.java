package net.bytestudio;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.bytestudio.scene.AccountScene;
import net.bytestudio.scene.ClientScene;
import net.bytestudio.scene.ErrorScene;
import net.bytestudio.scene.IScene;

public class StageManager {

    private IScene currentScene;
    private final Stage stage;

    public StageManager(Stage stage) {
        this.stage = stage;
    }

    public void changeScene(int sceneID) {
        switch (sceneID) {
            case 0:
                currentScene = new AccountScene();
                currentScene.initialize();
                currentScene.display(stage);
                break;
            case 1:
                currentScene = new ClientScene();
                currentScene.initialize();
                currentScene.display(stage);
                break;
            default:
                currentScene = new ErrorScene();
                currentScene.initialize();
                currentScene.display(stage);
                break;
        }
    }

    public void showStage() {
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public IScene getCurrentScene() {
        return currentScene;
    }
}
