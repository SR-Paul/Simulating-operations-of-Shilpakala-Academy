module com.example.oop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires javafx.graphics;


    opens com.example.oop to javafx.fxml;
    exports com.example.oop;
}