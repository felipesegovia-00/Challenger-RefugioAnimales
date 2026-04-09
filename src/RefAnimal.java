import java.util.Scanner;

public class RefAnimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] animales = new String[100]; // Array para almacenar los nombres de los animales 
        int[] edades = new int[100]; // Array para almacenar las edades de los animales
        String[] especies = new String[100]; // Array para almacenar las especies de los animales
        String[] estados = new String[100]; // Array para almacenar los estados de los animales
        int contadorAnimales = 0; // Contador para llevar el número de animales registrados 

        int opcion;
        do {
            System.out.println("================================");
            System.out.println("=========Refugio animal=========");
            System.out.println("================================");
            System.out.println("1. Registrar un nuevo animal");
            System.out.println("2. Registrar especie");
            System.out.println("3. Marcar animal como adoptado");
            System.out.println("4. Mostrar animales disponibles");
            System.out.println("5. mostrar animales adoptados");
            System.out.println("6. mostrar reporte general");//Aqui arregle por el estaba muy pegado
            System.out.println("7. Salir");
            System.out.print("Select an option: ");
            opcion = sc.nextInt();
            //Switch moderno
            switch (opcion) {
                case 1 -> {//dante
                    System.out.print("Ingresa el nombre del animal: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingresa la edad del animal: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingresa la especie del animal: ");
                    String especie = sc.nextLine();
                    System.out.print("Ingresa el estado del animal (disponible/adoptado):");
                    String estado = sc.nextLine();
                }
                case 2 -> {//bruno
                    System.out.print("Ingresa el nombre de la especie: ");
                    String nombreEspecie = sc.nextLine();
                    System.out.print("Ingresa la descripción de la especie: ");
                    String descripcionEspecie = sc.nextLine();
                }
                case 3 -> {//felipe
                    System.out.print("Ingresa el ID del animal a marcar como adoptado: ");
                    int idAnimal = sc.nextInt();
                }
                case 4 -> {//Allan
                    System.out.println("Animales disponibles:");
                    // Aquí se mostrarían los animales disponibles
                }
                case 5 -> {//dafne
                    System.out.println("Animales adoptados:");
                    // Aquí se mostrarían los animales adoptados
                    for (int i = 0; i < contadorAnimales; i++) {
                        if (estados[i].equals("Adoptado")) {
                            System.out.println((i + 1) + ". " + animales[i] + " - " + estados[i]);
                        } 
                    }
                }
                case 6 -> {//renato
                    int adoptados = 0;
                    int disponibles = 0;
                    for (int i = 0; i < contadorAnimales; i++) {
                        if ("adoptado".equalsIgnoreCase(estados[i])) {
                            adoptados++;
                        } else {
                            disponibles++;
                        }
                    }
                    System.out.println("========== Reporte General ==========");
                    System.out.println("Total de animales registrados: " + contadorAnimales);
                    System.out.println("Animales disponibles: " + disponibles);
                    System.out.println("Animales adoptados: " + adoptados);
                    System.out.println("--------- Detalle de animales ---------");
                    for (int i = 0; i < contadorAnimales; i++) {
                        System.out.println("ID: " + (i + 1) +
                                " | Nombre: " + animales[i] +
                                " | Especie: " + especies[i] +
                                " | Edad: " + edades[i] +
                                " | Estado: " + estados[i]);
                    }
                    System.out.println("=====================================");
                }
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 7);

        // Faltaba cerrar el scanner 
        sc.close();
    }
}
