package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *Εμφανίζει ένα μενού επιλογών και ο χρήστης
 * επιλέγει ένα menu item και στη συνέχεια ανάλογα
 * με την επιλογή, εκτελείται κάποια ενέργεια.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();

            if (!isChoiseValid(choice)) {
    System.out.println("Invalid choice");
    continue;
            }

            doOnChoice (choice);

        } while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("Eπιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή process");
                break;
                case 2:
                    System.out.println("Διαγραφή process");
                    break;
                    case 3:
                        System.out.println("Αναζήτηση process");
                        break;
                        case 4:
                            System.out.println("Ενημέρωση process");
                            break;
                            case 5:
                                System.exit(0);

        }
    }
}
