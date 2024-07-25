package esercizio;

public class Dirigente extends Dipendente {
    // attributi
    private int stipendioMensile;
    private int bonus;

    // costruttore
    public Dirigente(int stipendio, Dipartimento dipartimento, int stipendioMensile, int bonus) {
        super(stipendio, dipartimento);
        this.stipendioMensile = stipendioMensile;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "---------Dirigente---------\n{" +
                "stipendioMensile=" + stipendioMensile +
                ", \nbonus=" + bonus +
                ",  \nstipendioDirigente=" + calculateSalary() +
                '}';
    }

    @Override
    public int calculateSalary() {
        return stipendioMensile + bonus;
    }
}
