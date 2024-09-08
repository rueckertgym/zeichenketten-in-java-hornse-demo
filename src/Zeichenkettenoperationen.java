import java.util.Scanner;

public class Zeichenkettenoperationen {
    private Scanner scanner;
    private Tester test;

    public static void main(String[] args) {
        new Zeichenkettenoperationen();
    }

    public Zeichenkettenoperationen() {
        test = new Tester();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Zeichenkette umdrehen");
            System.out.println("[2] Palindromtest");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                this.test.setEingabe("");
                System.out.println("Gib die Zeichenkette an, die umgekehrt werden soll:");
                String zeichenkette = scanner.nextLine();
                this.test.setEingabe(zeichenkette);
                this.test.zeichenketteUmkehren();

            } else if (option == 2) {
                this.test.setEingabe("");
                this.test.setAusgabe("");
                System.out.println("Gib die Zeichenkette für den Palindromtest an:");
                String zeichenkette = scanner.nextLine();
                this.test.setEingabe(zeichenkette);
                this.test.palindromTest();
                System.out.println("Ist dein Wort ein Palindrom? Die Antwort lautet: "+this.test.isIstPalindrom());
                }
            else if (option == 0) {
                break;
        }
            System.out.println();
        }
    }
}