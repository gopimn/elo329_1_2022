package com.close;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

class MyWindowHandler implements EventHandler<WindowEvent>{
    public void handle(WindowEvent e) {
       System.out.println("Stage is closing");
    }
}

public class App extends Application {

    public void start(Stage primaryStage) { //Redefinimos un método de Application
        // Creamos elementos de la ventana
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
  
     // Creamos Listener asociado al cierre de ventana
        primaryStage.setOnCloseRequest(new MyWindowHandler());
        primaryStage.show();
     }

    public static void main(String[] args) {
        launch();
    }

}