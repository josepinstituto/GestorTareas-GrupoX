
public class Tarea {

	private String descripcion;
	private boolean completada;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCompletada() {
		return completada;
	}
	public void setCompletada(boolean completada) {
		this.completada = completada;
	}

	public Tarea(String descripcion) {
		this.descripcion = descripcion;
		this.completada = false;
	}
	
	//Metodo para listar tareas
	public String toString() {
	    String estado = completada ? "completa" : "incompleta";
	    return "Tarea [descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
}
