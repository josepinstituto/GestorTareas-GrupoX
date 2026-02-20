public class Main {

    public static void main(String[] args) {

        // Crear el gestor de tareas
        GestorTareas gestor = new GestorTareas();

        // Agregar algunas tareas
        gestor.addTarea("Estudiar programación en Java");
        gestor.addTarea("Hacer ejercicio");
        gestor.addTarea("Terminar el proyecto de GitHub");

        // Mostrar la lista de tareas
        System.out.println("Lista de tareas:");
        gestor.listarTareas();

        // Marcar una tarea como completada (por ejemplo, la segunda tarea -> índice 1)
        gestor.completarTarea(1);

        // Mostrar nuevamente la lista actualizada
        System.out.println("\nLista de tareas actualizada:");
        gestor.listarTareas();
    }
}