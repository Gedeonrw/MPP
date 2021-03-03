package lesson6.labs.prob2;

import java.util.HashMap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StringFx extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("String");

		GridPane rootPane = new GridPane();
		rootPane.setHgap(10);
		rootPane.setPadding(new Insets(10, 10, 10, 10));
		GridPane leftGrid = new GridPane();
		leftGrid.setVgap(10);
		GridPane rightGrid = new GridPane();

		Button countLetters = new Button("Count Letters");
		Button reverseLetters = new Button("Reverse Letters");
		Button removeDuplicates = new Button("Remove Duplicates");

		Label input = new Label("Input");
		TextField inputTextField = new TextField();

		Label output = new Label("Output");
		TextField outputTextField = new TextField();

		leftGrid.add(countLetters, 0, 0);
		leftGrid.add(reverseLetters, 0, 1);
		leftGrid.add(removeDuplicates, 0, 2);

		rightGrid.add(input, 0, 0);
		rightGrid.add(inputTextField, 0, 1);
		rightGrid.add(output, 0, 2);
		rightGrid.add(outputTextField, 0, 3);

		rootPane.add(leftGrid, 0, 0);
		rootPane.add(rightGrid, 1, 0);

		countLetters.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent e) {
				
				outputTextField.setText(countLetter(inputTextField.getText()));
			}

			private String countLetter(String text) {
				
				return "" + text.length();
			}

		});

		reverseLetters.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
			
				outputTextField.setText(reverseLetters(inputTextField.getText()));
			}

			private String reverseLetters(String text) {
				
				StringBuilder retString = new StringBuilder();
				for(int i=text.length()-1; i>=0; i--){
					retString.append(text.charAt(i));
				}
				return retString.toString();
			}

		});

		removeDuplicates.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				outputTextField.setText(removeDuplicates(inputTextField.getText()));
			}

			private String removeDuplicates(String text) {
				
				StringBuilder retString = new StringBuilder();
				HashMap<Character, Character> foundSet = new HashMap<>();
				for(int i=0; i<text.length(); i++){
					if(!foundSet.containsKey(text.charAt(i))){
						retString.append(text.charAt(i));
						foundSet.put(text.charAt(i), text.charAt(i));
					}
				}
				return retString.toString();
			}

		});



		Scene scene = new Scene(rootPane, 300, 125);
		primaryStage.setScene(scene);
		primaryStage.show();
	}



}
