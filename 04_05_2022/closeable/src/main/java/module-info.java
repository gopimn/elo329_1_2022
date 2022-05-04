module com.close {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.close to javafx.fxml;
    exports com.close;
}
