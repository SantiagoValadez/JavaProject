
//import java.util.Scanner;
public class postwork {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);


//Aqui se le llama a la clase Menu para que imprima el menu de opciones
        Menu leerOpciones = new Menu();
        leerOpciones.readData();

        int response;
        String userResponse;


        //------------------------AQUI SE SOLIA LEER EL MENU DE OPCIONES------------------------------
//        String appTareas [] ={
//                "Crear nueva lista de tareas.",
//                "Ver listas de tareas.",
//                "Ver tareas de lista.",
//                "Actualizar lista de tareas.",
//                "Eliminar lista de tareas.",
//                "Salir."
//        };

        //-------------------------ITERACION PARA QUE LEA EL ARREGLO-----------------------------------
//        for(int i= 0; i<appTareas.length;i++){
//            System.out.println((i+1) + " " + appTareas[i]);
//        }
        //------------------------AQUI SE SOLIA LEER EL MENU DE OPCIONES-------------------------------

        System.out.println("_____________________________");
//        response = scanner.nextInt();


        //-------------------------USO DE SWITCH PARA CONDICIONAR LA RESPUESTA-------------------------
//        if (response >= 1 && response <= 6) {
//            switch (response) {
//                case 1:
//                    userResponse = "Crear nueva lista de tareas.";
//                    break;
//                case 2:
//                    userResponse = "Ver listas de tareas.";
//                    break;
//                case 3:
//                    userResponse = "Ver tareas de lista.";
//                    break;
//                case 4:
//                    userResponse = "Actualizar lista de tareas.";
//                    break;
//                case 5:
//                    userResponse = "Eliminar lista de tareas.";
//                    break;
//                case 6:
//                    userResponse = "Salir.";
//                    break;
//                default:
//                    userResponse = "¡Intenta de nuevo!";
//            }
        //-------------------------USO DE SWITCH PARA CONDICIONAR LA RESPUESTA-------------------------

//
        Lector leerRespuesta = new Lector();
        leerRespuesta.respuesta();


//      //-------------------------AQUI VA LA RESPUESTA AL INPUT----------------------------------------
//            System.out.println("La opción seleccionada es: " + response +". "+ userResponse);
//        } else {
//           System.out.println("Tu calificación debe estar entre 1 y 10");
//        }
    }
}
