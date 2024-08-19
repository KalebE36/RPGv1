import characters.*; 
import scenes.*; 
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.MainMenu;


public class Game extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create an instance of MainMenuScene
        MainMenu mainMenu = new MainMenu();

        // Set the scene to the stage
        primaryStage.setScene(mainMenu.getScene());
        primaryStage.setTitle("RPG Game - Main Menu");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launches the JavaFX application
    }
}

