package esercizio;

import java.util.Random;

public class Dipendente {
    // attributi
    private int matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    // costruttori
    public Dipendente(int stipendio, Dipartimento dipartimento) {
        Random random = new Random();
        this.matricola = random.nextInt();
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "-------Dipendente--------\n{" +
                "matricola=" + matricola +
                ", \nstipendio=" + stipendio +
                ", \ndipartimento=" + dipartimento +
                '}';
    }
}
