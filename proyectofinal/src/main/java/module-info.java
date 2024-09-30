module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens co.edu.uniquindio.proyectofinal.Controllers to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal;
}
