package esercizio;

public class Main {
    public static void main(String[] args) {

        // Esercizio 1
       /* Dipendente dip1 = new Dipendente(1500, Dipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente(2500, Dipartimento.VENDITE);
        Dipendente dip3 = new Dipendente(15000, Dipartimento.AMMINISTRAZIONE);
        System.out.println(dip1);
        System.out.println(dip2);
        System.out.println(dip3);*/

        // Esercizio 2
        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = new DipendenteFullTime(1500, Dipartimento.PRODUZIONE);
        dipendenti[1] = new DipendentePartTime(0, Dipartimento.VENDITE, 40, 30);
        dipendenti[2] = new Dirigente(0, Dipartimento.AMMINISTRAZIONE, 8000, 2000);
        /*System.out.println(dipendenti[1]);
        System.out.println(dipendenti[2]);
        System.out.println(dipendenti[3]);*/

        int stipendioTot = 0;

        for (Dipendente dipendente : dipendenti) {
            System.out.println("----Dipendente-----\n" + dipendente);
            System.out.println("----Stipendio------\n" + dipendente.calculateSalary());
            stipendioTot += dipendente.calculateSalary();
        }
        System.out.println("--------Totale Stipendio Dipendenti: --------\n" + stipendioTot);

        // Esercizio 3

        Checkable[] persone = new Checkable[4];

        persone[0] = new DipendenteFullTime(2000, Dipartimento.PRODUZIONE);
        persone[1] = new DipendentePartTime(0, Dipartimento.VENDITE, 200, 30);
        persone[2] = new Dirigente(0, Dipartimento.AMMINISTRAZIONE, 9000, 3000);
        persone[3] = new Volontario("Pippo Baudo", 90, "Sono un bravo conduttore");

        for (Checkable persona : persone) {
            persona.checkIn();
            if (persona instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) persona;
                System.out.println(dipendente);
                System.out.println("------Stipendio:------\n" + dipendente.calculateSalary());
            } else {
                System.out.println(persona);
            }
        }
    }
}