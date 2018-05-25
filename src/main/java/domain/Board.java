/*
    Create the board the game play occurs on
*/
package domain;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Board {

    public int size;

    public Board(int s) {
        size = s;
    }

    private GridPane createGrid() {
        GridPane gPane = new GridPane();

        return gPane;
    }

    // create the text box the numbers will appear in
    private TextField box() {
        // make the text field
        TextField box = new TextField();

        return box;
    }

}
