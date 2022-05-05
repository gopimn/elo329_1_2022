module com.mimic {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mimic to javafx.fxml;
    exports com.mimic;
}
