package Aplicacion;


public aspect Aspecto {
	//pointcut successImprimir(): call(public * Interfaces*mostrarInfo*(TextField));
	pointcut successImprimir(): call(* *.mostrarInfo(..));
		after(): successImprimir(){
			System.out.println("Se mostr� la informaci�n correctamente");
		}
}
