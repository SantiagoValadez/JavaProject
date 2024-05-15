public class Menu {

        public void readData() {


                System.out.println("=====SELECCIONA UNA OPCIÓN=== ");
                System.out.println("---------------------------------");
                String appTareas [] ={
                        "Crear nueva lista de tareas.",
                        "Ver listas de tareas.",
                        "Ver tareas de lista.",
                        "Actualizar lista de tareas.",
                        "Eliminar lista de tareas.",
                        "Salir."
                };

                for(int i= 0; i<appTareas.length;i++){
                        System.out.println((i+1) + " " + appTareas[i]);
                }
        };
}
