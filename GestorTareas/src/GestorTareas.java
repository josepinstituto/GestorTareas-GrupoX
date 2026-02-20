import java.util.ArrayList;

public class GestorTareas {
	
	private ArrayList<Tarea> listaTareas;
	
	public GestorTareas() {
		this.listaTareas = new ArrayList();
	}


	
	public void listarTareas() {
		for (Tarea tarea : listaTareas) {
			System.out.println(tarea);
		}
		
	}
	
}
