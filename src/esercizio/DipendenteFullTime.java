package esercizio;

public class DipendenteFullTime extends Dipendente {
    // attributi
    private int stipendioMensile;

    public DipendenteFullTime(int stipendio, Dipartimento dipartimento) {
        super(stipendio, dipartimento);
        this.stipendioMensile = stipendio;
    }

    @Override
    public String toString() {
        return "---------DipendenteFullTime-------- \n{" +
                "stipendioMensile=" + stipendioMensile +
                '}';
    }

    @Override
    public int calculateSalary() {
        return stipendioMensile;
    }
}
