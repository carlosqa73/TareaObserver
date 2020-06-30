package Interfaces;

import java.util.Observable;
import java.util.Observer;

public class Notifier implements Observer {

	String color;
	
	public Notifier() {color = "No color";}
	
	
	@Override
	public void update(Observable o, Object c) {
		
		
		this.color = (String) c;
		System.out.println(toString());
		
		
	}
	
	@Override
	public String toString() {
		return "Actual color: " + color;
	}

}
