package Interfaces;

import java.util.Observable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VentanaPrincipal extends Observable{
	
	private VBox root;
	private HBox h;
	private HBox h2;
	private TextField tf;
	private Button boton1;
	private Button boton2;
	private Button boton3;
	private Button boton4;
	
	public VentanaPrincipal() {
		
		root = new VBox();
		h = new HBox();
		h2 = new HBox();
		tf = new TextField();
		boton1 = new Button("Azul");
		boton2 = new Button("Amarillo");
		boton3 = new Button("Rojo");
		boton4 = new Button("Imprimir");
		
		ejecutarEvento();
		
		h.getChildren().addAll(boton1, boton2, boton3);
		h.setSpacing(50);
		h.setAlignment(Pos.CENTER);
		
		h2.getChildren().addAll(boton4, tf);
		h2.setAlignment(Pos.CENTER);
		h2.setSpacing(50);
		
		root.getChildren().addAll(h,h2);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(40);
		root.setPadding(new Insets(100,100,100,100));
		
	}
	public void ejecutarEvento() {
		boton1.setOnMouseClicked(e -> {
		root.setStyle("-fx-background-color:blue");
		setChanged();
		notifyObservers("Blue");
		
		});
		
		boton2.setOnMouseClicked(e ->{	
		root.setStyle("-fx-background-color:yellow");	
		setChanged();
		notifyObservers("Yellow");
		});
		
		boton3.setOnMouseClicked(e ->{
		root.setStyle("-fx-background-color:red");
		setChanged();
		notifyObservers("Red");
		});
		
	}
	
	
	public VBox getRoot() {
		return root;
	}
	
}
