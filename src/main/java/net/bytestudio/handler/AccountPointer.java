package net.bytestudio.handler;

import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountPointer implements Initializable {

    /* header area */
    public HBox header;

    /* Sign in variables */
    public ImageView switch_login;
    public AnchorPane sign_in_page;

    public TextField usernameField;
    public Label passwordField;
    public Button sign_in_btn;
    public Button guest_btn;
    /* Sign up variables */
    public ImageView switch_register;
    public AnchorPane sign_up_page;
    /* Settings variables */
    public ImageView switch_settings;
    public AnchorPane settings_pane;

    public JFXToggleButton setup_startup;
    public JFXToggleButton setup_update;
    /* Close program */
    public ImageView close_program;

    /* Version tags */
    public Label version_text;
    public Label version_text1;
    public Label version_text2;


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
