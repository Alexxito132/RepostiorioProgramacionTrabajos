module org.example.holafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.holafx to javafx.fxml;
    exports org.example.holafx;
}