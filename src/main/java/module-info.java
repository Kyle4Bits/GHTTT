module com.example.ghttt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ghttt to javafx.fxml;
    exports com.example.ghttt;
}