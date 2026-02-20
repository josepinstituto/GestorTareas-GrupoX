import java.util.ArrayList;

public class GestorTareas {
	
	private ArrayList<Tarea> listaTareas;

	/**
	*Metodo para añadir tarea
	*@param nombre de la tarea
	*/
	private void addTarea(String nombreTarea) {
		listaTareas.add(new Tarea(nombreTarea));
	}
}