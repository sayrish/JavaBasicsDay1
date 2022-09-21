module com.example.javabasicsday1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicsday1 to javafx.fxml;
    exports com.example.javabasicsday1;
}