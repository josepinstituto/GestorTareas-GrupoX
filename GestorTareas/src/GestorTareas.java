import java.util.ArrayList;

public class GestorTareas {
	
	private ArrayList<Tarea> listaTareas;

	/**
	*Metodo para añadir tarea
	*@param nombre de la tarea
	*/
	private void addTarea(String descripcion) {
		listaTareas.add(new Tarea(descripcion));
	}
	
	private void completarTarea(int indice){
		listaTareas.get(indice).setCompletada(true);
		System.out.println("Tarea completada");
	}
}