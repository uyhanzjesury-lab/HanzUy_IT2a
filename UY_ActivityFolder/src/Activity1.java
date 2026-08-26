import java.util.Scanner;

public class Activity1 {
    public void greettheUser() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Birth year: ");
        int byear = sc.nextInt();

        System.out.print("Enter gender: ");
        String gend = sc.next();

        System.out.println("==============================");
        System.out.println("Hello, " + name + "! Welcome to Java");
        System.out.println("You were born in " + byear + " and your gender is " + gend);
    }
}