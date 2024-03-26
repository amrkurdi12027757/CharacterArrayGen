package org.example.characterarraygen;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class Component {
  public static <T> void Component(String fxml, T node) {
    URL resource = CharacterArrayGenApp.class.getResource(fxml);

    FXMLLoader fxmlLoader = new FXMLLoader(resource);
    fxmlLoader.setRoot(node);
    fxmlLoader.setController(node);

    try {
      fxmlLoader.load();
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }
}
