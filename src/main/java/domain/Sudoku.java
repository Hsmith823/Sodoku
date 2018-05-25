package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sudoku extends Application{

    // create main menu when game is loaded
    private void menu(GridPane pane) {
        // create the menu buttons
        Button newGame = new Button("New Game");
        Button continueGame = new Button("Continue");

        // add buttons to the scene
        pane.add(newGame,4,3);
        pane.add(continueGame,4,5);

        BackgroundImage image = new BackgroundImage(new Image()); 
        Background background = new Background(image);

        pane.setBackground(background);
    }

    @Override
    public void start(Stage primaryStage){
        // height and width of application
        int height = 400;
        int width = 400;

        // set the title of the application
        primaryStage.setTitle("Sudoku: That Silly Panda");

        // create the main menu
        GridPane main = new GridPane();
        menu(main);

        // set the scene
        primaryStage.setScene(new Scene(main,width,height));
        primaryStage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }

}
