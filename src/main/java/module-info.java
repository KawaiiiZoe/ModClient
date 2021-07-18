module net.bytestudio {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens net.bytestudio to javafx.fxml;
    exports net.bytestudio;
    exports net.bytestudio.handler;
    exports net.bytestudio.scene;
}
