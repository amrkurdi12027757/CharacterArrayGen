package org.example.characterarraygen;

import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Block extends Button {
  private static final String FX_BORDER_COLOR_GREY_FX_BORDER_WIDTH_2 = "-fx-border-color: #1e1e1e; -fx-border-width: 2;";
  private boolean clicked;
  private final int column;
  private final int row;

  public Block(@NamedArg("column") int column, @NamedArg("row") int row) {
    super();
    this.column = column;
    this.row = row;
    Component.<Button>Component("block.fxml", this);
    this.setStyle("-fx-background-color: #ffffff;" + FX_BORDER_COLOR_GREY_FX_BORDER_WIDTH_2);
  }

  public void click(ActionEvent actionEvent) {
    char number;
    if (clicked) {
      number = '0';
      this.setStyle("-fx-background-color: #ffffff;" + FX_BORDER_COLOR_GREY_FX_BORDER_WIDTH_2);
    } else {
      number = '1';
      this.setStyle("-fx-background-color: #7d8286;" + FX_BORDER_COLOR_GREY_FX_BORDER_WIDTH_2);
    }
    String coulmn = CharacterArrayGenApp.coulmns[column];
    char[] charArray = coulmn.toCharArray();

    charArray[row] = number;
    String newStr = new String(charArray);
    CharacterArrayGenApp.coulmns[column] = newStr;
    clicked = !clicked;
  }
}
