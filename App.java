import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.geometry.Insets;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Pos;


/**
 * Hauptanwendung
 */

public class App extends Application {

    public void start(Stage stage)
    {
        Canvas canvas = new Canvas(600, 400);         // Zeichenfläche
        GraphicsContext gc = canvas.getGraphicsContext2D(); // Graphikkontext der Zeichenfläche

        Skizze skizze = new Skizze(gc);     //Meine Zeichnung!

        // Das Menu
        VBox vbox = new VBox(10);
       
        Button button1 = new Button("Start");
        Button button2 = new Button("Reset");

        button1.setPrefWidth(100);
        button2.setPrefWidth(100);
     

        button1.setOnAction(e -> skizze.start());               
        button2.setOnAction(e -> skizze.reset());
       
        
        canvas.setOnMouseClicked(e -> skizze.sprung());

        vbox.getChildren().addAll(button1,button2);
        vbox.setPadding(new Insets(30,30,30,30));
        
      
        

        // Oberfläche zusammenbauen
        Pane root = new Pane();  

        root.getChildren().addAll(canvas,vbox);
       
        vbox.setLayoutX(440);
        vbox.setLayoutY(20);        
       
        
        // Fenster
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Meine Skizze");
        stage.show();

        // Anwendung starten
        // skizze.setup(gc);  // Setup der Skizze aufrufen

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
