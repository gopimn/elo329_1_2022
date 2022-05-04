module com.c2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.c2 to javafx.fxml;
    exports com.c2;
}
