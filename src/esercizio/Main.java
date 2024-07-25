package esercizio;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente(1500, Dipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente(2500, Dipartimento.VENDITE);
        Dipendente dip3 = new Dipendente(15000, Dipartimento.AMMINISTRAZIONE);
        System.out.println(dip1);
        System.out.println(dip2);
        System.out.println(dip3);
    }
}