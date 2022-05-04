package com.mimic;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;


class MimicHandler implements EventHandler<KeyEvent>{
	private Label label;
	private TextField textfield;
	public MimicHandler(Label l , TextField t) {
		this.label = l;
		this.textfield = t;
	}
	
	public void handle(KeyEvent event) {
		//if (event.getCode() == KeyCode.ENTER){
		   updateLabel();
		//}
	}
	
	private void updateLabel() {
		label.setText(textfield.getText());
	}
}

public class App extends Application {

	private Label label;
	private TextField textfield;
	public void start(Stage primaryStage) {
		FlowPane layout = new FlowPane();
		Scene scene = new Scene(layout,200,50);
		label = new Label("Echo appears here");
		textfield = new TextField();
		textfield.setPrefWidth(200);
		layout.getChildren().addAll(textfield,label);
		primaryStage.setScene(scene);
		MimicHandler mh = new MimicHandler(label,textfield);
		textfield.setOnKeyReleased(mh);
		primaryStage.show();
	}

    public static void main(String[] args) {
        launch();
    }

}