import java.util.Scanner;
public class Lector {


    public void respuesta (){

        Scanner scanner = new Scanner(System.in);
        Menu leerOpciones = new Menu();
        leerOpciones.readData();

        int response= 0;
        String userResponse;

        response = scanner.nextInt();

        if (response >= 1 && response <= 6) {
        switch (response) {
            case 1:
                userResponse = "Crear nueva lista de tareas.";
                break;
            case 2:
                userResponse = "Ver listas de tareas.";
                break;
            case 3:
                userResponse = "Ver tareas de lista.";
                break;
            case 4:
                userResponse = "Actualizar lista de tareas.";
                break;
            case 5:
                userResponse = "Eliminar lista de tareas.";
                break;
            case 6:
                userResponse = "Salir.";
                break;
            default:
                userResponse = "¡Intenta de nuevo!";
            }
            System.out.println("La opción seleccionada es: " + response +". "+ userResponse);
            } else {
            System.out.println("Tu opción debe ser un numero entre 1 y 6");

        }

        do {
            leerOpciones.readData();
            response = scanner.nextInt();

            if (response >= 1 && response <= 6) {
                switch (response) {
                    case 1:
                        userResponse = "Crear nueva lista de tareas.";
                        break;
                    case 2:
                        userResponse = "Ver listas de tareas.";
                        break;
                    case 3:
                        userResponse = "Ver tareas de lista.";
                        break;
                    case 4:
                        userResponse = "Actualizar lista de tareas.";
                        break;
                    case 5:
                        userResponse = "Eliminar lista de tareas.";
                        break;
                    case 6:
                        userResponse = "Salir.";
                        break;
                    default:
                        userResponse = "¡Intenta de nuevo!";
                }
                System.out.println("La opción seleccionada es: " + response +". "+ userResponse);
            } else {
                System.out.println("Tu opción debe ser un numero entre 1 y 6");

            }
        } while (response != 6);
    }
}
