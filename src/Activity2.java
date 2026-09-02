import java.util.Scanner;

public class Activity2 {

    public void cinemaTicketing() {

        Scanner sc = new Scanner(System.in);

        String fmt = "";
        double price = 0;
        double fee = 0;

        System.out.println("========================================");
        System.out.println("       🎬 CINEMA TICKET SYSTEM 🎬");
        System.out.println("========================================");

        System.out.println();
        System.out.println("        AVAILABLE FORMATS");
        System.out.println("----------------------------------------");
        System.out.println(" [1] REGULAR       PHP 350.00");
        System.out.println(" [2] 3D            PHP 400.00");
        System.out.println(" [3] IMAX          PHP 450.00");
        System.out.println("----------------------------------------");

        System.out.print("Select Format: ");
        int f = sc.nextInt();

        System.out.print("Enter Screening Hour (24-Hour Format): ");
        int h = sc.nextInt();


        if (f == 1) {
            fmt = "REGULARs";
            price = 350.00;
        } else if (f == 2) {
            fmt = "3D";
            price = 400.00;
        } else if (f == 3) {
            fmt = "IMAX";
            price = 450.00;
        } else {
            System.out.println("\nInvalid format!");
            return;
        }

        if (h >= 17 && h <= 20) {
            fee = 50.00;
        }

        double total = price + fee;

        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|            🎟 TICKET RECEIPT         |");
        System.out.println("+--------------------------------------+");
        System.out.println("|                                      |");
        System.out.printf ("|  Format       : %-20s  |%n", fmt);
        System.out.printf ("|  Base Price   : PHP %-14.2f  |%n", price);
        System.out.printf ("|  Peak Fee     : PHP %-14.2f  |%n", fee);
        System.out.println("|                                      |");
        System.out.println("+--------------------------------------+");
        System.out.printf ("|  TOTAL        : PHP %-14.2f  |%n", total);
        System.out.println("|                                      |");
        System.out.println("|  STATUS       : SEAT RESERVED       |");
        System.out.println("+--------------------------------------+");


        System.out.println();
        System.out.println("        Enjoy your movie! 🍿");
    }
}
