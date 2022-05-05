module com.one {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.one to javafx.fxml;
    exports com.one;
}
