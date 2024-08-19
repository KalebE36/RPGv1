package scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class MainMenu {
    private Scene scene;

    public MainMenu() {
        // Create layout
        VBox layout = new VBox(20); /* VBox with 20px spacing */ 
        layout.setAlignment(Pos.CENTER);
        
        Image playButton = new Image(getClass().getResourceAsStream("/res/play_button.jpg"));
        ImageView playButtonView = new ImageView(playButton);
        playButtonView.setFitWidth(50);
        playButtonView.setFitHeight(50);
        playButtonView.setPreserveRatio(true);
        
        
        Button startButton = new Button("Start Game");
        startButton.setGraphic(playButtonView); 
        
        
        Button loadButton = new Button("Load Game");
        Button exitButton = new Button("Exit");
        
        layout.getChildren().addAll(startButton, loadButton, exitButton);
        exitButton.setOnAction(e -> Platform.exit());
        
        this.scene = new Scene(layout, 800, 600); /* Width 800, Height 600 */
    }

    // Getter to access the scene
    public Scene getScene() {
        return scene;
    }
}

