package Aplicacion;

import Interfaces.VentanaPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VentanaPrincipal vp = new VentanaPrincipal();
		
		Scene scene = new Scene(vp.getRoot());
		primaryStage.setTitle("PROGRAMA");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}	
	
	

