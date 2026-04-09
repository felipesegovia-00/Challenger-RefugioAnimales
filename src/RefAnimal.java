import java.util.Scanner;

public class RefAnimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] animales = new String[100]; // Array para almacenar los nombres de los animales
        int[] edades = new int[100]; // Array para almacenar las edades de los animales
        String[] especies = new String[100]; // Array para almacenar las especies de los animales
        String[] estados = new String[100]; // Array para almacenar los estados de los animales
        int contadorAnimales = 0; // Contador para llevar el número de animales registrados
        String[] catalogoEspecies = new String[50]; // Catálogo de especies disponibles
        int contadorEspecies = 0;

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
                    System.out.println( "\n=== REGISTRAR ANIMAL ===");


                    System.out.println("Nombre del animal: ");
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    String nombre = sc.nextLine().trim();

                    //1. Validar si el nombre ya existe
                    boolean duplicado = false;
                    for (int i = 0; i < contadorAnimales; i++) {
                        if (animales[i].equalsIgnoreCase(nombre)) {
                            duplicado = true;
                        }
                    }
                    //2. Validar si la especie existe en el catálogo
                    System.out.println("Especie: ");
                    String especieInput = sc.nextLine().trim();

                    boolean especieValida = false;
                    for (int i = 0; i < contadorEspecies; i++) {
                        if (catalogoEspecies[i].equalsIgnoreCase(especieInput)) {
                            especieValida = true;
                        }
                    }
                  //3. Logica de guardado con las condiciones
                  if (duplicado) {
                      System.out.println("Error: El animal ya esta registrado.");
                  } else if (!especieValida) {
                      System.out.println("Error: La especie no existe. Registrala en la opcion 2.");
                  } else {
                      System.out.println("Edad: ");
                      int edad = sc.nextInt();
                      sc.nextLine();

                      //Guardar datos

                      animales[contadorAnimales] = nombre;
                      especies[contadorAnimales] = especieInput;
                      edades[contadorAnimales] = edad;
                      estados[contadorAnimales] = "Disponible"; // Estado inicial obligatorio.

                      contadorAnimales++;
                      System.out.println("Animal registrado correctamente.");
                  }
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



    }
    public static void mostrarAnimalesDisponibles(Map<String, String> estadoAnimal) {
        // mostramos un mensaje si el campo del estado esta vacio.
                if (estadoAnimal.isEmpty()) {
                    System.out.println(" No hay animales registrados. ");

                }else {
                    // reccoremos el mapa
                    estadoAnimal.forEach((nombre, estado ) -> {
                        // mostramos solo si hay animales disponibles
                        if (estado.equalsIgnoreCase("disponible")) {
                            System.out.println(" - " + nombre);
                        }
                    });

                }
    }
}
