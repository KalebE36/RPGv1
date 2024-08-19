package scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;


public class MainMenu {
    private Scene scene;

    public MainMenu() {
        // Create layout
        VBox layout = new VBox(20); // VBox with 10px spacing
        layout.setAlignment(Pos.CENTER);
        
        // Create buttons
        Button startButton = new Button("Start Game");
        
        
        
        Button loadButton = new Button("Load Game");
        Button exitButton = new Button("Exit");
        
        // Add buttons to layout
        layout.getChildren().addAll(startButton, loadButton, exitButton);
        exitButton.setOnAction(e -> Platform.exit());
        
        // Create scene with the layout
        this.scene = new Scene(layout, 800, 600); // Width 800, Height 600
    }

    // Getter to access the scene
    public Scene getScene() {
        return scene;
    }
}

