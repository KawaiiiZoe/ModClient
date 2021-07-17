module net.bytestudio {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.bytestudio to javafx.fxml;
    exports net.bytestudio;
    exports net.bytestudio.handler;
}
