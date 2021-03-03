package lesson6.labs.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AddressForm extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("My Form");

		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(0);
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setPadding(new Insets(10, 10, 10, 10));

		Label name = new Label("Name");
		grid.add(name, 0, 0);

		TextField nameTextField = new TextField();
		grid.add(nameTextField, 0, 1);

		Label street = new Label("Street");
		grid.add(street, 1, 0);

		TextField streetTextField = new TextField();
		grid.add(streetTextField, 1, 1);

		Label city = new Label("City");
		grid.add(city, 2, 0);

		TextField cityTextField = new TextField();
		grid.add(cityTextField, 2, 1);

		GridPane grid1 = new GridPane();
		grid1.setHgap(5);
		grid1.setVgap(0);
		grid1.setAlignment(Pos.CENTER);
		grid1.setPadding(new Insets(10, 10, 10, 10));

		Label state = new Label("State");
		grid1.add(state, 0, 0);

		TextField stateTextField = new TextField();
		grid1.add(stateTextField, 0, 1);

		Label zip = new Label("Zip");
		grid1.add(zip, 1, 0);

		TextField zipTextField = new TextField();
		grid1.add(zipTextField, 1, 1);

		GridPane grid3 = new GridPane();
		grid3.setHgap(5);
		grid3.setVgap(0);
		grid3.setAlignment(Pos.BOTTOM_CENTER);
		grid3.setPadding(new Insets(10, 10, 10, 10));

		Button btn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        grid3.add(hbBtn, 0, 0);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	System.out.println(nameTextField.getText() + "\n" + streetTextField.getText() + "\n"
            			+ cityTextField.getText() + ", " + stateTextField.getText() + " " + zipTextField.getText());
            }
        });

		StackPane rootPane = new StackPane();
        rootPane.getChildren().addAll(grid, grid1, grid3);
        Scene scene = new Scene(rootPane, 350, 150);
        primaryStage.setScene(scene);
        
        primaryStage.show();
	}

}
