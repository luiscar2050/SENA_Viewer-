import edu.misena.senaviewer.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido a SenaViewed¡\n\n";

            message += "1. Book\n";
            message += "2. Chapter\n";
            message += "3. Movie\n";
            message += "4. Serie\n";
            message += "5. Magazine\n";
            message += "6. Report\n";
            message += "7. Report Today\n";
            message += "8. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Book.menuBook();
                    break;
                case 2:
                    Chapter.menuChapter();
                    break;
                case 3:
                    Movie.menuMovie();
                    break;
                case 4:
                    Serie.menuSerie();
                    break;
                case 5:
                    Magazine.menuMagazine();
                    break;
                case 6: System.out.println("Report");
                    break;
                case 7: System.out.println("Report Today");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }

        }while(opcion !=8);
    }
}