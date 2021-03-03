package warmUp;

import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class One extends Application{

	public static void main(String[] args) {
	

	}

	@Override
	 public void start(Stage primaryStage) throws Exception{
	primaryStage.setTitle("My First FX");
	Button btn = new Button("Click me");
	
	
	GridPane  sp = new GridPane();
 //  sp.getChildren().add(btn);
	
	Scene sn = new Scene(sp, 300,300);
	primaryStage.setScene(sn);
	primaryStage.show();
	
	
   
	 }

}
