package Aplicacion;


public aspect Aspecto {
	pointcut successImprimir(): call(* *.mostrarInfo(..));
		after(): successImprimir(){
			System.out.println("Se mostró la información correctamente");
		}
	pointcut successCambio(): call(* *.setChanged());
		after(): successCambio(){
			System.out.println("Cambio de color exitoso");
		}
}
