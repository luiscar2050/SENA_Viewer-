package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Movie extends Film{

    static int timeViewed;

    public Movie(String title,String gender,String creator,int duration,short year){
        super(title, gender, creator, duration,year);
    }

    static Movie movie = new Movie("Deadpool", "Accion", "Ryan Reynolds", 90, (short) 2014);

    public static int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public static void menuMovie(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido al menu de Movie¡\n\n";

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
                        String message1 = "\n\n!Bienvenido a la vista de Movie¡\n\n";

                        message1 += "1. Ver titulo de la pelicula\n";
                        message1 += "2. Ver genero de la pelicula\n";
                        message1 += "3. Ver autor de la pelicula\n";
                        message1 += "4. Ver duracion de la pelicula\n";
                        message1 += "5. Ver año del capitulo\n";
                        message1 += "6. Ver toda la informacion\n";
                        message1 += "7. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo del capitulo es: " + getTitle());
                                break;
                            case 2:
                                System.out.println("El genero de la pelicula es: " + getGender());
                                break;
                            case 3:
                                System.out.println("El autor de la pelicula es: " + getCreator());
                                break;
                            case 4:
                                System.out.println("La duracion de la pelicula es: " + getDuration());
                                break;
                            case 5:
                                System.out.println("El año de la pelicula es: " + getYear());
                                break;
                            case 6:
                                System.out.println("Informacion de la pelicula:");
                                System.out.println("titulo: " + getTitle());
                                System.out.println("genero: " + getGender());
                                System.out.println("autor: " + getCreator());
                                System.out.println("duracion: " + getDuration());
                                System.out.println("año: " + getYear());
                                break;
                            case 7:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion1 !=7);
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
                ", " + super.toString() +
                '}';
    }
}