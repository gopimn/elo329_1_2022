module com.mm2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mm2 to javafx.fxml;
    exports com.mm2;
}
