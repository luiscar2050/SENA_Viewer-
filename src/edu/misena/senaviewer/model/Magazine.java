package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.Scanner;

public class Magazine extends Publication{

    int id;

    public Magazine(String title,String editionDate,String editorial){
        super(title, editionDate, editorial);
    }

    static Magazine magazine = new Magazine("Vea", "05/23/2006", "JoseJose");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void menuMagazine(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido al menu de Magazine¡\n\n";

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
                        String message1 = "\n\n!Bienvenido a la vista de Magazine¡\n\n";

                        message1 += "1. Ver titulo del Magazine\n";
                        message1 += "2. Ver duracuion del Magazine\n";
                        message1 += "3. Ver año del Serie\n";
                        message1 += "4. Ver toda la informacion\n";
                        message1 += "5. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo de la revista es: " + getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de la revista es: " + getEditionDate());
                                break;
                            case 3:
                                System.out.println("La editorial de la revista es: " + getEditorial());
                                break;
                            case 4:
                                System.out.println("Informacion de la revista:");
                                System.out.println("titulo: " + getTitle());
                                System.out.println("fecha: " + getEditionDate());
                                System.out.println("editorial: " + getEditorial());
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
                super.toString() +
                '}';
    }
}