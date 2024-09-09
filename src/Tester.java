/**
 * Beschreiben Sie hier die Klasse Tester.
 *
 * @author Sebastian Horn
 * @version 0.1
 */
public class Tester {
    private String eingabe;
    private String ausgabe;
    private boolean istPalindrom;

    /**
     * Konstruktor für Objekte der Klasse Tester. Ein Objekt wird erzeugt und die beiden Attribute zEingabe und zAusgabe
     * initialisiert.
     */
    public Tester() {
        eingabe = "";
        ausgabe = "";
        istPalindrom = false;
    }

    /**
     * Get-Methode zum Auslesen des Attributs eingabe.
     *
     * @return eingabe : String
     */
    public String getEingabe() {
        return eingabe;
    }

    /**
     * Get-Methode zum Auslesen des Attributs ausgabe.
     *
     * @return ausgabe : String
     */
    public String getAusgabe() {
        return ausgabe;
    }

    /**
     * Set-Methode zum setzen eines neuen Wertes für das Attribut
     *  eingabe
     * @param pEingabe : String
     */
    public void setEingabe(String pEingabe) {
       eingabe=pEingabe;
    }

    /**
     * Set-Methode zum Setzen eines neuen Wertes für das Attribut
     * ausgabe.
     *
     * @param pAusgabe : String
     */
    public void setAusgabe(String pAusgabe) {
        ausgabe = pAusgabe;
    }

    /**
     * Die Methode führt einen Palindromtest durch und gibt zurück, ob das Wort ein PAlindrom ist oder nicht.
     *
     * @return istPalindrom : boolean
     */
    public boolean palindromTest() {
        //dein Quellcode hier
        this.zeichenketteUmkehren();
        if (ausgabe.compareTo(eingabe)==0) {
            this.istPalindrom = true;
        } else {
            this.istPalindrom = false;
        }
        return istPalindrom;
    }

    /**
     * Die in der Vairiable eingabe gespeicherte Zeichenkette wird umgekehrt und zurückgegeben.
     *
     * @return umgedrehtes : String
     */
    public String zeichenketteUmkehren() {
        System.out.println(eingabe);
        for(int i =eingabe.length()-1; i>=0;i--){
            ausgabe = ausgabe + eingabe.charAt(i);
            System.out.println(ausgabe);
        }
        System.out.println(ausgabe);
        return  ausgabe;
    }

    /**
     * Get-Methode zum Auslesen des Attributs istPalindrom.
     *
     * @return istPalindrom : boolean
     */
    public boolean isIstPalindrom() {
        return istPalindrom;
    }
}
