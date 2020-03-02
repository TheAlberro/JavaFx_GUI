import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

  


import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application implements EventHandler<ActionEvent> {

    Stage window;
    BorderPane layout;

   Button button;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Saper, czyli jak się nie rozerwać");

        //File menu
        Menu fileMenu = new Menu("Gra");
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));

        
        
         //Difficulty RadioMenuItems
        Menu difficultyMenu = new Menu("Poziom");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);
        //Edit menu
        Menu editMenu = new Menu("Edytuj");
        editMenu.getItems().add(new MenuItem("Wygląd"));
     //   editMenu.getItems().add(new MenuItem("Copy"));
       // MenuItem paste = new MenuItem("Paste");
     //   paste.setOnAction(e -> System.out.println("Pasting some crap"));
        //paste.setDisable(true);
      //  editMenu.getItems().add(paste);

        //Help menu
        Menu helpMenu = new Menu("Pomoc");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if(showLines.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Hiding line number");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

       

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);
        /*
        button = new Button();
        button.setText("Click me");
        
        
        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
        */
        
         primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click me");
        StackPane layout2 = new StackPane();
        layout.setTop(menuBar);
        layout2.getChildren().add(button);
        Scene scene = new Scene(layout2, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}