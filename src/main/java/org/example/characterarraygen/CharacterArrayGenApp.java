package org.example.characterarraygen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterArrayGenApp extends Application {
  public static final String[] coulmns = new String[]{
          "00000000",
          "00000000",
          "00000000",
          "00000000",
          "00000000",
          "00000000",
          "00000000",
  };
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(CharacterArrayGenApp.class.getResource("main.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Character Array Generator");
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}