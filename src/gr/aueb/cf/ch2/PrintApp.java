package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;

        System.out.println("Η ημερομηνιά είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνιά είναι:  %02d/%02d/%d", day , month + year);
    }
}
