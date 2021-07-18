package net.bytestudio.handler;

import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountPointer implements Initializable {

    /* Sign in variables */
    public ImageView switch_login;
    public AnchorPane sign_in_page;
    /* Sign up variables */
    public ImageView switch_register;
    public AnchorPane sign_up_page;
    /* Settings variables */
    public ImageView switch_settings;
    public AnchorPane settings_pane;
    /* Close program */
    public ImageView close_program;


    //Todo: change this and make it cleaner
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        switch_login.setOnMouseClicked(mouseEvent -> {
            sign_in_page.setVisible(true);
            sign_up_page.setVisible(false);
            settings_pane.setVisible(false);
        });

        switch_register.setOnMouseClicked(mouseEvent -> {
            sign_in_page.setVisible(false);
            sign_up_page.setVisible(true);
            settings_pane.setVisible(false);
        });

        switch_settings.setOnMouseClicked(mouseEvent -> {
            sign_in_page.setVisible(false);
            sign_up_page.setVisible(false);
            settings_pane.setVisible(true);
        });

        close_program.setOnMouseClicked(mouseEvent -> {
            //Todo: create dialog for the close or background option.
            System.exit( 0 );
        });
    }
}
