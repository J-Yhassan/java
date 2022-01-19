module com.example.distributeur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.distributeur to javafx.fxml;
    exports com.example.distributeur;
}