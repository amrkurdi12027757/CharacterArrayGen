package org.example.characterarraygen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.Arrays;

public class CharacterArrayGenController {
  @FXML
  public TextArea answer;

  public void onClick(ActionEvent actionEvent) {
    String[] columns = CharacterArrayGenApp.coulmns;
    String[] hexColumns = new String[columns.length];
    for (int i = 0; i < columns.length; i++) {
      String hex = Integer.toHexString(Integer.parseInt(columns[i], 2)).toUpperCase();
      hexColumns[i] = hex.length() < 2 ? "0" + hex : hex;
      if (hexColumns[i].charAt(0) >= 'A') hexColumns[i] = "0" + hexColumns[i];
    }
    answer.setText(String.join("b,", columns) + "b\n" + String.join("h,", hexColumns) + "h");
  }
}