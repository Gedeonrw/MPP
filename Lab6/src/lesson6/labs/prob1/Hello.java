package lesson6.labs.prob1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Hello extends Application{

	public static void main(String[] args) {
		launch(args);

	}
@Override 
public void start(Stage primaryStage) throws Exception{
	primaryStage.setTitle("Hello");
	Button btn = new Button();
	//btn.setText("say 'Hello'");
	  btn.setOnAction(new EventHandler<ActionEvent>() {
		@Override 
		public void handle(ActionEvent event) {
			System.out.println("Hello World");
		}
	});
	
	StackPane st = new StackPane();
	st.getChildren().add(st);
	primaryStage.setScene(new Scene(st,300,250));
	primaryStage.show();
	
}

}
