module com.example.prep_exam2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.prep_exam2 to javafx.fxml;
    exports com.example.prep_exam2;
}