package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.Scanner;


public class Book extends Publication {
    int id;
    static int isbn;
    boolean readed;
    int timeReaded;

    public Book(String title, String editionDate, String editorial, int isbn) {
        super(title, editionDate, editorial);
        this.isbn = isbn;
    }

    static Book book = new Book("Narnia", "12/09/2024", "holaMundo", 125452214);

    public static int getIsbn() {
        return isbn;
    }

    public static void menuBook() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            String message = "\n\n¡Bienvenido al menú de Book!\n\n";
            message += "1. Ver información\n";
            message += "2. Actualizar información\n";
            message += "3. Salir...\n\n";

            System.out.println(message);
            System.out.print("Elige tu opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcion1;

                    do {
                        String message1 = "\n\n¡Bienvenido a la vista de Book!\n\n";
                        message1 += "1. Ver título del libro\n";
                        message1 += "2. Ver fecha de edición del libro\n";
                        message1 += "3. Ver editorial del libro\n";
                        message1 += "4. Ver ISBN del libro\n";
                        message1 += "5. Ver toda la informacion\n";
                        message1 += "6. Salir...\n\n";

                        System.out.println(message1);
                        System.out.print("Elige tu opción: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1) {
                            case 1:
                                System.out.println("El título del libro es: " + getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edición del libro es: " + getEditionDate());
                                break;
                            case 3:
                                System.out.println("La editorial del libro es: " + getEditorial());
                                break;
                            case 4:
                                System.out.println("El ISBN del libro es: " + getIsbn());
                                break;
                            case 5:
                                System.out.println("Informacion del libro:");
                                System.out.println("titulo: " + getTitle());
                                System.out.println("fecha de edición: " + getEditionDate());
                                System.out.println("editorial: " + getEditorial());
                                System.out.println("ISBN: " + getIsbn());
                                break;
                            case 6:
                                System.out.println("Saliendo del menú de información...");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    } while (opcion1 != 6);
                    break;

                case 2:
                    int opcion2;

                    do {
                        String message2 = "\n\n¡Bienvenido al actualizador de Book!\n\n";
                        message2 += "1. Actualizar título del libro\n";
                        message2 += "2. Actualizar fecha de edición del libro\n";
                        message2 += "3. Actualizar editorial del libro\n";
                        message2 += "4. Actualizar ISBN del libro\n";
                        message2 += "5. Salir...\n\n";

                        System.out.println(message2);
                        System.out.print("Elige tu opción: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:
                                System.out.println("Saliendo del menú de actualización...");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    } while (opcion2 != 5);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (opcion != 3);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                ", " + super.toString() +
                '}';
    }

}