package Aplicacion;


public aspect Aspecto {
	pointcut successImprimir(): call(* *.mostrarInfo(..));
		after(): successImprimir(){
			System.out.println("Se mostr� la informaci�n correctamente");
		}
	pointcut successCambio(): call(* *.setChanged());
		after(): successCambio(){
			System.out.println("Cambio de color exitoso");
		}
}
