package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Serie extends Film{

    static int timeViewed;
    static int sessionQuantity;

    public Serie( String title,String gender,int duration){
        super(title, gender, duration);
    }

    static Serie serie = new Serie("Spider-man", "Accion", 120);

    public static int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public static int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public static void menuSerie(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido al menu de Serie¡\n\n";

            message += "1. Ver informacion\n";
            message += "2. Actualizar informacion\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\n!Bienvenido a la vista de Serie¡\n\n";

                        message1 += "1. Ver titulo del Serie\n";
                        message1 += "2. Ver duracuion del Serie\n";
                        message1 += "3. Ver año del Serie\n";
                        message1 += "4. Ver toda la informacion\n";
                        message1 += "5. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo de la Serie es: " + getTitle());
                                break;
                            case 2:
                                System.out.println("El genero de la Serie es: " + getGender());
                                break;
                            case 3:
                                System.out.println("La duracion de la Serie es: " + getDuration());
                                break;
                            case 4:
                                System.out.println("Informacion de la serie:");
                                System.out.println("titulo: " + getTitle());
                                System.out.println("genero: " + getGender());
                                System.out.println("duracion: " + getDuration());
                                break;
                            case 5:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion1 !=5);
                    break;
                case 2:
                    int opcion2;

                    do{
                        String message2 = "\n\n!Bienvenido al Setter de Chapter¡\n\n";

                        message2 += "1. Actualizar titulo del capitulo\n";
                        message2 += "2. Actualizar duration del capitulo\n";
                        message2 += "3. Actualizar año del capitulo\n";
                        message2 += "4. Salir...\n\n";

                        System.out.println(message2);

                        System.out.println("Elige tu opcion: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion2 !=4);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }

        }while(opcion !=3);

    }

    @Override
    public String toString() {
        return "Book{" +
                "timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                ", " + super.toString() +
                '}';
    }
}