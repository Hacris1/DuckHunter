module org.example.empezandojuegos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;



    opens co.com.u.icesi.duckhunt to javafx.fxml;
    exports co.com.u.icesi.duckhunt;
    
}