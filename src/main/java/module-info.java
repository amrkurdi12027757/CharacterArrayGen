module org.example.characterarraygen {
  requires javafx.controls;
  requires javafx.fxml;


  opens org.example.characterarraygen to javafx.fxml;
  exports org.example.characterarraygen;
}