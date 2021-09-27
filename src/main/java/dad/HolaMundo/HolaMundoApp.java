package dad.HolaMundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaMundoApp extends Application {

	private Label saludoLabel;
	private Button saludarButton;
	private TextField nombreText;
	private VBox root;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		//Creamos cuadro de texto
		nombreText = new TextField();
		nombreText.setPromptText("Introduce tu nombre.");
		nombreText.setMaxWidth(150); //ancho del cuadro de texto
		
		
		//creamos etiqueta
		saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo.");
		
		
		//creamos botón
		saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setOnAction(e -> onSaludar(e));
		saludarButton.setDefaultButton(true);
		
		//Panel con disposición vertical
		root = new VBox();
		root.setSpacing(15);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludoLabel,saludarButton);
		
		
		//Creamos la escena
		Scene scene = new Scene(root,320,200);
		
		
		//configuramos la ventana
		primaryStage.setTitle("Hola Mundo mejorado");
		primaryStage.setScene(scene);
		primaryStage.show();
			
}
	private void onSaludar(ActionEvent e) {
		String nombre  = nombreText.getText();
		saludoLabel.setText("Hola "+ nombre + "!");
		saludoLabel.setStyle("-fx-text-fill: red; -fx-font: bold 40 consolas");
	}

	public static void main(String[] args) {
		launch(args);
	}
}