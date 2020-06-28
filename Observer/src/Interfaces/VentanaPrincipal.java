package Interfaces;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class VentanaPrincipal {
	
	private HBox root;
	private Button boton1;
	private Button boton2;
	private Button boton3;
	
	public VentanaPrincipal() {
		
		root = new HBox();
		boton1 = new Button("Azul");
		boton2 = new Button("Amarillo");
		boton3 = new Button("Rojo");
		
		root.getChildren().addAll(boton1, boton2, boton3);
		root.setSpacing(50);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100,100,100,100));
		
	}
	
	public HBox getRoot() {
		return root;
	}
	
}
