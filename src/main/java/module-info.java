module com.example.hwl1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.hwl1 to javafx.fxml;
    exports com.example.hwl1;
}